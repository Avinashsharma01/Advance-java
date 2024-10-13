package NetWorking;
import java.io.IOException;
import java.net.*;

public class AboutURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}