import java.net.ServerSocket;
import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashSet;
import java.io.FileReader;
import java.util.Objects;
import java.net.Socket;

/**
 * ReservationServer.java
 *
 * The reservation server
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public final class ReservationServer {
    private ServerSocket serverSocket;
    public ReservationServer(File file) throws IOException { //this will do all of the booking and everything
        BufferedReader reader;

        Objects.requireNonNull(file, "the specified file is null");
        reader = new BufferedReader(new FileReader(file));

        this.serverSocket = new ServerSocket(1234);

    }
    public void serveClients() {
        Socket clientSocket;
        Thread handlerThread;
        int clientCount = 0;

        System.out.printf("<Now serving clients on port %d...>%n", this.serverSocket.getLocalPort());

        while (true) {
            try {
                clientSocket = this.serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();

                return;
            }


            System.out.printf("<Client %d connected...>%n", clientCount);

            clientCount++;
        }
    }

}
