package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class main {
    private static ServerSocket serverSocket;
    private static List<clientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(8081);
            System.out.println("Server started. Listening on port 8081.");
            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept incoming connection
                System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());
                clientHandler clientHandler = new clientHandler(clientSocket);
                clients.add(clientHandler); // Add client handler to the list
                clientHandler.start(); // Start new thread for each client
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void broadcastMessage(String message) {
        for (clientHandler client : clients) {
            client.sendMessage(message);
        }
    }
}

