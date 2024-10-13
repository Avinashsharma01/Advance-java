package NetWorking;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket to listen on port 8000
        DatagramSocket socket = new DatagramSocket(8000);

        System.out.println("UDP Server started on port 8000");

        while (true) {
            // Create a DatagramPacket to receive data
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Receive data from a client
            socket.receive(packet);

            // Get the sender's address and port
            InetAddress address = packet.getAddress();
            int port = packet.getPort();

            // Print the received data
            String data = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received from " + address + ":" + port + ": " + data);

            // Send a response back to the client
            String response = "Hello, client!";
            byte[] responseBytes = response.getBytes();
            DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, address, port);
            socket.send(responsePacket);
        }
    }
}