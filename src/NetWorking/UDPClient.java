package NetWorking;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket
        DatagramSocket socket = new DatagramSocket();

        // Set the server address and port
        InetAddress serverAddress = InetAddress.getByName("localhost");
        int serverPort = 8000;

        // Send a message to the server
        String message = "Hello, server!";
        byte[] messageBytes = message.getBytes();
        DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length, serverAddress, serverPort);
        socket.send(packet);

        // Receive a response from the server
        byte[] buffer = new byte[1024];
        DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);
        socket.receive(responsePacket);

        // Print the response
        String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
        System.out.println("Received from server: " + response);
    }
}