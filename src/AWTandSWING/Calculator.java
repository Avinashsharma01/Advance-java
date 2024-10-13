package AWTandSWING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[4];
    JButton equalsButton, clearButton;
    JPanel panel;
    double number1, number2, result;
    char operation;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 0;

        textField = new JTextField(16);
        frame.add(textField, gbc);

        gbc.gridwidth = 1;

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            gbc.gridx = i % 4;
            gbc.gridy = (i / 4) + 1;
            frame.add(numberButtons[i], gbc);
        }

        String[] functions = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            functionButtons[i] = new JButton(functions[i]);
            functionButtons[i].addActionListener(this);
            gbc.gridx = i;
            gbc.gridy = 3;
            frame.add(functionButtons[i], gbc);
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(equalsButton, gbc);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 4;
        frame.add(clearButton, gbc);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        for (int i = 0; i < 4; i++) {
            if (e.getSource() == functionButtons[i]) {
                number1 = Double.parseDouble(textField.getText());
                operation = functions(i);
                textField.setText("");
            }
        }

        if (e.getSource() == equalsButton) {
            number2 = Double.parseDouble(textField.getText());
            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
            }
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == clearButton) {
            textField.setText("");
        }
    }

    char functions(int i) {
        switch (i) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3:
                return '/';
        }
        return ' ';
    }

    public static void main(String[] args) {
        new Calculator();
    }
}