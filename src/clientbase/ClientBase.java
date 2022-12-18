package clientbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientBase {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Apertua connessione");
        try {
            Socket server = new Socket("127.0.0.1", 5500);
            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
            in.close();
            server.close();
            System.out.println("chiusura connessione");
        } catch (IOException ex) {
            Logger.getLogger(ClientBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
