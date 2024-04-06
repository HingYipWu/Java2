package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class main {
   public static ServerSocket ss;
   public static void main(String[] args) {
      try {
          ss = new ServerSocket(8081);
          System.out.println("Server started. Listening on port 8081.");
          while (true) {
              Socket s = ss.accept(); 
              clientHandler clientThread = new clientHandler(s);
              clientThread.start(); 
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
   }
}
