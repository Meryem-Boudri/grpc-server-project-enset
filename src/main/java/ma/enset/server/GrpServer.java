package ma.enset.server;



import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.enset.service.BankGrpcService;

import java.io.IOException;

public class GrpServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server= ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
