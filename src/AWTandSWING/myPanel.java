package AWTandSWING;
import java.awt.*;
public class myPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame with Panel");
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();



        frame.setSize(400, 400);
        frame.setBackground(Color.gray);
        frame.setLayout(null);


        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);



        Button button1 = new Button("Click Me1");
        Button button2 = new Button("Click Me2");
        Button button3 = new Button("Click Me3");
        Button button4 = new Button("Click Me4");


        button1.setBounds(80, 80, 60, 30);
        button2.setBounds(50, 50, 60, 30);
        button3.setBounds(50, 50, 60, 30);
        button4.setBounds(50, 50, 60, 30);

        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);


        panel1.setSize(200, 200);
        panel2.setSize(200, 200);
        panel3.setSize(200, 200);
        panel4.setSize(200, 200);

        panel1.setLocation(0,0);
        panel2.setLocation(200,0);
        panel3.setLocation(0,200);
        panel4.setLocation(200,200);


        panel1.setBackground(Color.green);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setVisible(true);

    }
}

















////package AWTandSWING;
//package AWTandSWING;
//
//import java.awt.*;
//
//public class myPanel {
//    public static void main(String[] args) {
//
//        Frame frame = new Frame("Frame with Panel");
//        Panel panel1 = new Panel();
//        Panel panel2 = new Panel();
//        Panel panel3 = new Panel();
//        Panel panel4 = new Panel();
//
//        frame.setSize(400, 400);
//        frame.setBackground(Color.gray);
//        frame.setLayout(null);
//
//        // Set layout for panels to null so, we can manually position buttons
//        panel1.setLayout(null);
//        panel2.setLayout(null);
//        panel3.setLayout(null);
//        panel4.setLayout(null);
//
//        // Create buttons
//        Button button1 = new Button("Click Me1");
//        Button button2 = new Button("Click Me2");
//        Button button3 = new Button("Click Me3");
//        Button button4 = new Button("Click Me4");
//
//        // Set bounds (size and location) for buttons within their respective panels
//        button1.setBounds(50, 50, 100, 50);
//        button2.setBounds(50, 50, 100, 50);
//        button3.setBounds(50, 50, 100, 50);
//        button4.setBounds(50, 50, 100, 50);
//
//        // Add buttons to their respective panels
//        panel1.add(button1);
//        panel2.add(button2);
//        panel3.add(button3);
//        panel4.add(button4);
//
//        // Set size and location for the panels
//        panel1.setSize(200, 200);
//        panel2.setSize(200, 200);
//        panel3.setSize(200, 200);
//        panel4.setSize(200, 200);
//
//        panel1.setLocation(0, 0);
//        panel2.setLocation(200, 0);
//        panel3.setLocation(0, 200);
//        panel4.setLocation(200, 200);
//
//        // Set different background colors for the panels
//        panel1.setBackground(Color.green);
//        panel2.setBackground(Color.red);
//        panel3.setBackground(Color.blue);
//        panel4.setBackground(Color.yellow);
//
//        // Add panels to the frame
//        frame.add(panel1);
//        frame.add(panel2);
//        frame.add(panel3);
//        frame.add(panel4);
//
//        // Make the frame visible
//        frame.setVisible(true);
//    }
//}
//
