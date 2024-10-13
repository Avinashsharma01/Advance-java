package NetWorking;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;


public class UDPServer2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = null;
        while (true) {
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            System.out.println("Client: " + data(buffer));
            if (data(buffer).toString().equals("exit")) {
                System.out.println("Client sent exit...");
                break;
            }
            buffer = new byte[65535];
        }
    }

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


