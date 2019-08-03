package client;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClientHandler implements Runnable {
    private int n;
    private int id;
    Socket socket;

    public  ClientHandler (Socket soc) {
        n = n+1;
        id = n;
        socket = soc;
    }

    public void run(){
        try {
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String in = "";
            while((in = br.readLine()) != null) {
                System.out.println("Info received: " + in);
                pw.write(in + "\n");
                pw.flush();
                if (in.equals("exit")){
                    pw.close();
                    br.close();
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("ClientHandler error: " + e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("ClientHandler close error: " + e);
            }
        }
    }


}