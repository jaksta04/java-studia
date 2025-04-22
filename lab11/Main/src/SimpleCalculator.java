import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField display;
    private double firstNumber = 0;
    private String operator = "";
    private boolean isNewInput = true;

    public SimpleCalculator() {
        setTitle("Prosty Kalkulator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Wyświetlacz
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Panel przycisków
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        add(buttonPanel, BorderLayout.CENTER);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "Rad->Deg", "Deg->Rad", "C", "sqrt"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            try {
                if ("0123456789.".contains(command)) {
                    if (isNewInput) {
                        display.setText(command);
                    } else {
                        display.setText(display.getText() + command);
                    }
                    isNewInput = false;
                } else if ("/*-+".contains(command)) {
                    firstNumber = Double.parseDouble(display.getText());
                    operator = command;
                    isNewInput = true;
                } else if (command.equals("=")) {
                    double secondNumber = Double.parseDouble(display.getText());
                    double result = calculate(firstNumber, secondNumber, operator);
                    display.setText(String.valueOf(result));
                    isNewInput = true;
                } else if (command.equals("Rad->Deg")) {
                    double radians = Double.parseDouble(display.getText());
                    double degrees = Math.toDegrees(radians);
                    display.setText(String.valueOf(degrees));
                } else if (command.equals("Deg->Rad")) {
                    double degrees = Double.parseDouble(display.getText());
                    double radians = Math.toRadians(degrees);
                    display.setText(String.valueOf(radians));
                } else if (command.equals("C")) {
                    display.setText("0");
                    isNewInput = true;
                } else if (command.equals("sqrt")) {
                    double value = Double.parseDouble(display.getText());
                    display.setText(String.valueOf(Math.sqrt(value)));
                }
            } catch (Exception ex) {
                display.setText("Error");
                isNewInput = true;
            }
        }
    }

    private double calculate(double num1, double num2, String op) {
        switch (op) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num2 != 0 ? num1 / num2 : Double.NaN;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator().setVisible(true));
    }
}
