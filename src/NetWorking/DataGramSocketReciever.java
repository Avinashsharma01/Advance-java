package NetWorking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataGramSocketReciever {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8000);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        System.out.println("Datagram received: " + new String(packet.getData(), 0, packet.getLength()));
    }
}