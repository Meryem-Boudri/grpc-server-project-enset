package ma.enset.service;

import io.grpc.stub.StreamObserver;
import ma.enset.org.sid.grpc.stubs.Bank;
import ma.enset.org.sid.grpc.stubs.BankServiceGrpc;

public class BankGrpcService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String currencyForm = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyFrom();
        double amount = request.getAmount();
        Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                .setAmount(amount)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(amount * 11.3)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getAccount(Bank.GetAccountRequest request, StreamObserver<Bank.GetAccountResponse> responseObserver) {
        super.getAccount(request, responseObserver);
    }

    @Override
    public void getListAccounts(Bank.GetListAccountsRequest request, StreamObserver<Bank.GetListAccountsResponse> responseObserver) {
        super.getListAccounts(request, responseObserver);
    }

    @Override
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionRequest request, StreamObserver<Bank.AccountTransaction> responseObserver) {
        super.getStreamOfAccountTransactions(request, responseObserver);
    }

    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> performStream(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Bank.ConvertCurrencyRequest>() {
            double sum = 0;

            @Override
            public void onNext(Bank.ConvertCurrencyRequest convertCurrencyRequest) {
                sum += convertCurrencyRequest.getAmount();

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

                Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                        .setResult(sum * 11.3)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> fullCurrencyStream(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Bank.ConvertCurrencyRequest>() {
            @Override
            public void onNext(Bank.ConvertCurrencyRequest convertCurrencyRequest) {
              //flux dependant
                Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                        .setResult(convertCurrencyRequest.getAmount() * Math.random() * 40)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                //serveur est fini lorsque le client fini
                responseObserver.onCompleted();

            }
        };
    }
}
