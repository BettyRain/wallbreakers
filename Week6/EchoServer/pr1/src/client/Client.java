package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws IOException {
        final int PORT = 7070;
        PrintWriter pw = null;
        BufferedReader br = null;
        Socket soc = null;
        try {
            soc = new Socket("localhost", PORT);
            pw = new PrintWriter(soc.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        } catch (UnknownHostException e) {
            System.out.println("Client host error: " + e);
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Client connection error: " + e);
            System.exit(1);
        }
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (bf.readLine() != null) {
            String line = bf.readLine();
            pw.println(line);
            if (line.equals("Stop"))
                break;
            System.out.println("Echo: " + br.readLine());
        }
        soc.close();
        br.close();
        pw.close();
        bf.close();
    }
}