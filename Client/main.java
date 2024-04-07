package Client;

import java.io.*;
import java.net.Socket;

public class main {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8081;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            System.out.println("Connected to server.");

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello from client!".getBytes());

            // Close resources
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
