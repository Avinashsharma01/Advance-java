package NetWorking;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPServer3 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] receiveBuffer = new byte[1024];
        byte[] sendBuffer;
        DatagramPacket receivePacket;
        InetAddress clientAddress = null;
        int clientPort = -1;
        Scanner sc = new Scanner(System.in); // For taking console input from server

        while (true) {
            // Receiving data from the client
            receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);

            // Get client's IP and port for response
            clientAddress = receivePacket.getAddress();
            clientPort = receivePacket.getPort();

            // Displaying the received message
            String receivedMessage = data(receiveBuffer).toString();
            System.out.println("Client: " + receivedMessage);

            // Exit condition
            if (receivedMessage.equals("exit")) {
                System.out.println("Client sent exit...");
                break;
            }

            // Server takes input from console to send back to client
            System.out.print("Server: ");
            String response = sc.nextLine();
            sendBuffer = response.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
            socket.send(sendPacket);

            // Reset the buffer for the next message
            receiveBuffer = new byte[1024];
        }
        socket.close();
    }

    // Convert byte array to StringBuilder
    public static StringBuilder data(byte[] a) {
        if (a == null) {
            return null;
        }
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
