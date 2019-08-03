package server;

import client.ClientHandler;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        final int PORT = 7070;

        // Thread t = new Thread(() -> {
        //     ServerWindow.main(null);
        //  });
        //   t.start();
        System.out.println("System is running...");
        try (ServerSocket ss = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = ss.accept();
                System.out.println("NEW CLIENT");
                Thread client = new Thread(new ClientHandler(socket));
                client.start();
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e);
        }
    }

}