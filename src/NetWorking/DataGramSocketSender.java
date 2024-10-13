package NetWorking;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataGramSocketSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        byte[] data = "Hello, world!".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, address, 8000);
        socket.send(packet);
        System.out.println("Datagram sent!");
    }
}