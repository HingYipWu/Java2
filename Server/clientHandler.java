package Server;

import java.io.*;
import java.net.Socket;

public class clientHandler extends Thread {
    private Socket socket;
    private OutputStream outputStream;
    private BufferedReader reader;

    public clientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            outputStream = socket.getOutputStream();
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Message from client: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        try {
            outputStream.write((message + "\n").getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
