package AWTandSWING.LayoutManager;

import java.awt.*;

public class GridLayoutManager {
    GridLayoutManager(){
        // Creating Frame
        Frame frame = new Frame("Grid Layout Manager");

        // Creating Buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        Button button7 = new Button("Button 7");
        Button button8 = new Button("Button 8");
        Button button9 = new Button("Button 9");

        // Setting Background and Foreground Color
        button1.setBackground(Color.red);
        button2.setBackground(Color.green);
        button3.setBackground(Color.blue);
        button4.setBackground(Color.yellow);
        button5.setBackground(Color.pink);
        button6.setBackground(Color.orange);
        button7.setBackground(Color.magenta);
        button8.setBackground(Color.cyan);
        button9.setBackground(Color.gray);

        // Setting Foreground Color
        button1.setForeground(Color.white);
        button2.setForeground(Color.white);
        button3.setForeground(Color.white);
        button4.setForeground(Color.white);
        button5.setForeground(Color.white);
        button6.setForeground(Color.white);
        button7.setForeground(Color.white);
        button8.setForeground(Color.white);
        button9.setForeground(Color.white);



        // Setting Layout
        frame.setLayout(new GridLayout(3,3));

        // Adding Buttons to Frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);


        // Setting Frame Size and Visibility
        frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        new GridLayoutManager();
    }

}
