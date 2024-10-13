package AWTandSWING;
import javax.swing.*;
import java.awt.*;

public class Nptel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JButton button = new JButton("Click");
        JButton button1 = new JButton("ok");
        frame.add(button);
        frame.add(button1);
//        frame.add(new JButton("OK"));
//        frame.add(new JButton("Cancel"));
        frame.setLayout(new GridLayout(2, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}