package NetWorking;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.Scanner;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPClient2 {
    public static void main(String[] args) throws IOException {
        // code here
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
        while (true) {
            String inp = sc.nextLine();
            buf = inp.getBytes();
            DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 12345);
            ds.send(dp);
            if (inp.equals("exit")) {
                break;
            }
        }

    }
}
