import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest,
      Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = Bank.ConvertCurrencyRequest.class,
      responseType = Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest,
      Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest, Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<Bank.ConvertCurrencyRequest, Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.GetAccountRequest,
      Bank.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = Bank.GetAccountRequest.class,
      responseType = Bank.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Bank.GetAccountRequest,
      Bank.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<Bank.GetAccountRequest, Bank.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
          BankServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<Bank.GetAccountRequest, Bank.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.GetListAccountsRequest,
      Bank.GetListAccountsResponse> getGetListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccounts",
      requestType = Bank.GetListAccountsRequest.class,
      responseType = Bank.GetListAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Bank.GetListAccountsRequest,
      Bank.GetListAccountsResponse> getGetListAccountsMethod() {
    io.grpc.MethodDescriptor<Bank.GetListAccountsRequest, Bank.GetListAccountsResponse> getGetListAccountsMethod;
    if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
          BankServiceGrpc.getGetListAccountsMethod = getGetListAccountsMethod = 
              io.grpc.MethodDescriptor.<Bank.GetListAccountsRequest, Bank.GetListAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.GetListAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.GetListAccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccounts"))
                  .build();
          }
        }
     }
     return getGetListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.GetStreamOfAccountTransactionRequest,
      Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfAccountTransactions",
      requestType = Bank.GetStreamOfAccountTransactionRequest.class,
      responseType = Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Bank.GetStreamOfAccountTransactionRequest,
      Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod() {
    io.grpc.MethodDescriptor<Bank.GetStreamOfAccountTransactionRequest, Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;
    if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
          BankServiceGrpc.getGetStreamOfAccountTransactionsMethod = getGetStreamOfAccountTransactionsMethod = 
              io.grpc.MethodDescriptor.<Bank.GetStreamOfAccountTransactionRequest, Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfAccountTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.GetStreamOfAccountTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfAccountTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfAccountTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.AccountTransaction,
      Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitStreamOfTransactions",
      requestType = Bank.AccountTransaction.class,
      responseType = Bank.PerformStreamOfTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Bank.AccountTransaction,
      Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<Bank.AccountTransaction, Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionsMethod;
    if ((getSubmitStreamOfTransactionsMethod = BankServiceGrpc.getSubmitStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitStreamOfTransactionsMethod = BankServiceGrpc.getSubmitStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getSubmitStreamOfTransactionsMethod = getSubmitStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<Bank.AccountTransaction, Bank.PerformStreamOfTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.PerformStreamOfTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getSubmitStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest,
      Bank.ConvertCurrencyResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = Bank.ConvertCurrencyRequest.class,
      responseType = Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest,
      Bank.ConvertCurrencyResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest, Bank.ConvertCurrencyResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
          BankServiceGrpc.getPerformStreamMethod = getPerformStreamMethod = 
              io.grpc.MethodDescriptor.<Bank.ConvertCurrencyRequest, Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest,
      Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullCurrencyStream",
      requestType = Bank.ConvertCurrencyRequest.class,
      responseType = Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest,
      Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<Bank.ConvertCurrencyRequest, Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;
    if ((getFullCurrencyStreamMethod = BankServiceGrpc.getFullCurrencyStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getFullCurrencyStreamMethod = BankServiceGrpc.getFullCurrencyStreamMethod) == null) {
          BankServiceGrpc.getFullCurrencyStreamMethod = getFullCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<Bank.ConvertCurrencyRequest, Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "fullCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("fullCurrencyStream"))
                  .build();
          }
        }
     }
     return getFullCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.AccountTransaction,
      Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransaction",
      requestType = Bank.AccountTransaction.class,
      responseType = Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Bank.AccountTransaction,
      Bank.AccountTransaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<Bank.AccountTransaction, Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<Bank.AccountTransaction, Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "executeStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("executeStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Bank.AccountTransaction,
      Bank.Empty> getSubmitTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitTransaction",
      requestType = Bank.AccountTransaction.class,
      responseType = Bank.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Bank.AccountTransaction,
      Bank.Empty> getSubmitTransactionMethod() {
    io.grpc.MethodDescriptor<Bank.AccountTransaction, Bank.Empty> getSubmitTransactionMethod;
    if ((getSubmitTransactionMethod = BankServiceGrpc.getSubmitTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitTransactionMethod = BankServiceGrpc.getSubmitTransactionMethod) == null) {
          BankServiceGrpc.getSubmitTransactionMethod = getSubmitTransactionMethod = 
              io.grpc.MethodDescriptor.<Bank.AccountTransaction, Bank.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bank.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitTransaction"))
                  .build();
          }
        }
     }
     return getSubmitTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void convert(Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<Bank.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccounts(Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<Bank.GetListAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<Bank.AccountTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfAccountTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Bank.AccountTransaction> submitStreamOfTransactions(
        io.grpc.stub.StreamObserver<Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubmitStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Bank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrencyStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<Bank.AccountTransaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    /**
     */
    public void submitTransaction(Bank.AccountTransaction request,
        io.grpc.stub.StreamObserver<Bank.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Bank.ConvertCurrencyRequest,
                Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Bank.GetAccountRequest,
                Bank.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetListAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Bank.GetListAccountsRequest,
                Bank.GetListAccountsResponse>(
                  this, METHODID_GET_LIST_ACCOUNTS)))
          .addMethod(
            getGetStreamOfAccountTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Bank.GetStreamOfAccountTransactionRequest,
                Bank.AccountTransaction>(
                  this, METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS)))
          .addMethod(
            getSubmitStreamOfTransactionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Bank.AccountTransaction,
                Bank.PerformStreamOfTransactionsResponse>(
                  this, METHODID_SUBMIT_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Bank.ConvertCurrencyRequest,
                Bank.ConvertCurrencyResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullCurrencyStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                Bank.ConvertCurrencyRequest,
                Bank.ConvertCurrencyResponse>(
                  this, METHODID_FULL_CURRENCY_STREAM)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                Bank.AccountTransaction,
                Bank.AccountTransaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .addMethod(
            getSubmitTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Bank.AccountTransaction,
                Bank.Empty>(
                  this, METHODID_SUBMIT_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void convert(Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<Bank.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccounts(Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<Bank.GetListAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<Bank.AccountTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfAccountTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Bank.AccountTransaction> submitStreamOfTransactions(
        io.grpc.stub.StreamObserver<Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubmitStreamOfTransactionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Bank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<Bank.AccountTransaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void submitTransaction(Bank.AccountTransaction request,
        io.grpc.stub.StreamObserver<Bank.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public Bank.ConvertCurrencyResponse convert(Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public Bank.GetAccountResponse getAccount(Bank.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public Bank.GetListAccountsResponse getListAccounts(Bank.GetListAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public java.util.Iterator<Bank.AccountTransaction> getStreamOfAccountTransactions(
        Bank.GetStreamOfAccountTransactionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfAccountTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Bank.Empty submitTransaction(Bank.AccountTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSubmitTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bank.ConvertCurrencyResponse> convert(
        Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Bank.GetAccountResponse> getAccount(
        Bank.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Bank.GetListAccountsResponse> getListAccounts(
        Bank.GetListAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Bank.Empty> submitTransaction(
        Bank.AccountTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_LIST_ACCOUNTS = 2;
  private static final int METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS = 3;
  private static final int METHODID_SUBMIT_TRANSACTION = 4;
  private static final int METHODID_SUBMIT_STREAM_OF_TRANSACTIONS = 5;
  private static final int METHODID_PERFORM_STREAM = 6;
  private static final int METHODID_FULL_CURRENCY_STREAM = 7;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((Bank.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<Bank.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNTS:
          serviceImpl.getListAccounts((Bank.GetListAccountsRequest) request,
              (io.grpc.stub.StreamObserver<Bank.GetListAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS:
          serviceImpl.getStreamOfAccountTransactions((Bank.GetStreamOfAccountTransactionRequest) request,
              (io.grpc.stub.StreamObserver<Bank.AccountTransaction>) responseObserver);
          break;
        case METHODID_SUBMIT_TRANSACTION:
          serviceImpl.submitTransaction((Bank.AccountTransaction) request,
              (io.grpc.stub.StreamObserver<Bank.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_STREAM_OF_TRANSACTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.submitStreamOfTransactions(
              (io.grpc.stub.StreamObserver<Bank.PerformStreamOfTransactionsResponse>) responseObserver);
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencyStream(
              (io.grpc.stub.StreamObserver<Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<Bank.AccountTransaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetListAccountsMethod())
              .addMethod(getGetStreamOfAccountTransactionsMethod())
              .addMethod(getSubmitStreamOfTransactionsMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullCurrencyStreamMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .addMethod(getSubmitTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
