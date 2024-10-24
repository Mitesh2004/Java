import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField result;
    Button[] buttons;
    String[] labels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
    String operand1 = "", operand2 = "", operator = "";

    Calculator() {
        setLayout(new GridLayout(5, 4));
        result = new TextField();
        add(result);

        buttons = new Button[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new Button(labels[i]);
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            if (!operator.isEmpty()) {
                operand2 += command;
            } else {
                operand1 += command;
            }
            result.setText(operand1 + operator + operand2);
        } else if (command.equals("=")) {
            double resultValue = performCalculation();
            result.setText("" + resultValue);
            operand1 = "" + resultValue;
            operator = operand2 = "";
        } else {
            if (!operator.isEmpty()) return;
            operator = command;
            result.setText(operand1 + operator);
        }
    }

    private double performCalculation() {
        double num1 = Double.parseDouble(operand1);
        double num2 = Double.parseDouble(operand2);

        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
        }
        return 0;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
