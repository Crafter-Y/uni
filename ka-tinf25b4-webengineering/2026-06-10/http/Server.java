package http;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main() throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        Socket socket = serverSocket.accept();

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("HTTP/1.1 200 OK\n" +
                "Content-Length: 12\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "\n" +
                "Hello World!");

        socket.close();
        serverSocket.close();
    }
}
