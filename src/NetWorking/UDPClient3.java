package NetWorking;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte[] sendBuffer;
        byte[] receiveBuffer = new byte[1024];

        while (true) {
            // Read input from user
            System.out.print("Client: ");
            String inp = sc.nextLine();
            sendBuffer = inp.getBytes();

            // Send packet to the server
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, ip, 12345);
            ds.send(sendPacket);

            // Exit condition
            if (inp.equals("exit")) {
                break;
            }

            // Receive response from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            ds.receive(receivePacket);

            // Display server's response
            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server: " + serverResponse);

            // Reset the buffer for the next message
            receiveBuffer = new byte[1024];
        }
        ds.close();
    }
}
