import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
    private static JTextField inputBox;
    private static double memory = 0;
    private double firstNum = 0;
    private String operator = "";
    private boolean startNew = true;

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(400, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(JFrame frame) {
        JPanel panel = new JPanel();
        Calculator calc = new Calculator();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        inputBox = new JTextField("", 15);
        inputBox.setEditable(false);
        inputBox.setHorizontalAlignment(JTextField.RIGHT);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 5;
        panel.add(inputBox, gbc);
        gbc.gridwidth = 1;

        String[] buttons = {
                "MC","MR","M+","M-","CE",
                "7","8","9","÷","√x",
                "4","5","6","×","%",
                "1","2","3","-","π",
                "0",".","+/-","+","=",
                "xʸ","R2","R0","AC"
        };

        int row = 1, col = 0;
        for (String text : buttons) {
            JButton b = new JButton(text);
            b.addActionListener(calc);
            gbc.gridx = col; gbc.gridy = row;
            panel.add(b, gbc);
            col++;
            if (col == 5) { col = 0; row++; }
        }

        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            switch (cmd) {
                case "AC": inputBox.setText(""); operator = ""; firstNum = 0; memory = 0; break;
                case "CE": inputBox.setText(""); break;
                case "MC": memory = 0; break;
                case "MR": inputBox.setText("" + memory); break;
                case "M+": memory += Double.parseDouble(inputBox.getText()); break;
                case "M-": memory -= Double.parseDouble(inputBox.getText()); break;
                case "√x": inputBox.setText("" + Math.sqrt(Double.parseDouble(inputBox.getText()))); break;
                case "%": inputBox.setText("" + (Double.parseDouble(inputBox.getText()) / 100)); break;
                case "π": inputBox.setText("3.1415926536"); break;
                case "+/-": inputBox.setText("" + (Double.parseDouble(inputBox.getText()) * -1)); break;
                case "R2": inputBox.setText(String.format("%.2f", Double.parseDouble(inputBox.getText()))); break;
                case "R0": inputBox.setText(String.format("%.0f", Double.parseDouble(inputBox.getText()))); break;
                case "+": case "-": case "×": case "÷": case "xʸ":
                    firstNum = Double.parseDouble(inputBox.getText());
                    operator = cmd;
                    startNew = true;
                    break;
                case "=":
                    double second = Double.parseDouble(inputBox.getText());
                    double result = switch (operator) {
                        case "+" -> firstNum + second;
                        case "-" -> firstNum - second;
                        case "×" -> firstNum * second;
                        case "÷" -> firstNum / second;
                        case "xʸ" -> Math.pow(firstNum, second);
                        default -> second;
                    };
                    inputBox.setText("" + result);
                    startNew = true;
                    break;
                default:
                    if (startNew) {
                        inputBox.setText(cmd.equals(".") ? "0." : cmd);
                        startNew = false;
                    } else {
                        inputBox.setText(inputBox.getText() + cmd);
                    }
            }
        } catch (Exception ex) {
            inputBox.setText("Error");
            startNew = true;
        }
    }
}