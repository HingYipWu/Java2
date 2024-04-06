package Server;

import java.io.IOException;
import java.net.Socket;

public class clientHandler extends Thread {
    private Socket socket;
    
    public clientHandler(Socket socket) {
        this.socket = socket;
    }
    
    public void run() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
