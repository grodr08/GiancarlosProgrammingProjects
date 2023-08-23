import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {

    // Methods
    public static Double performMultiplication(Double num1, Double num2){
            return num1 * num2;
    }

    public static Double performDivision(Double num1, Double num2){
        return num1 / num2;
    }

    public static Double performAddition(Double num1, Double num2){
        return num1 + num2;
    }

    public static Double performSubtraction(Double num1, Double num2){
        return num1 - num2;
    }

    public static void main(String[] args) {
        // Create the GUI on the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(450, 300);
        frame.setLayout(null);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Background Color
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Input Labels
        JLabel title = new JLabel("Calculator");
        title.setBounds(150, 0, 150, 50);
        Font font = new Font(title.getFont().getName(), Font.PLAIN, 20);
        title.setFont(font);
        frame.add(title);

        JLabel inputOne = new JLabel("First input");
        inputOne.setBounds(50, 50, 150, 30);
        frame.add(inputOne);

        JLabel inputTwo = new JLabel("Second input");
        inputTwo.setBounds(50, 90, 150, 30);
        frame.add(inputTwo);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(50, 145, 150, 30);
        resultLabel.setFont(font);
        frame.add(resultLabel);

        // Input Boxes
        JTextField boxOne = new JTextField(5);
        boxOne.setBounds(160, 55, 100, 20);
        frame.add(boxOne);

        JTextField boxTwo = new JTextField(5);
        boxTwo.setBounds(160, 95, 100, 20);
        frame.add(boxTwo);

        // Operator Buttons
        JButton plusButton = new JButton("*");
        plusButton.setBounds(300, 55, 45, 20);
        frame.add(plusButton);

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(boxOne.getText());
                    double value2 = Double.parseDouble(boxTwo.getText());
                    double result = performMultiplication(value1, value2);
                    resultLabel.setText(String.valueOf(result));
                }
                catch (NumberFormatException error) {
                    resultLabel.setText("Only Numbers");
                }
            }
        });

        JButton divideButton = new JButton("/");
        divideButton.setBounds(300, 95, 45, 20);
        frame.add(divideButton);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(boxOne.getText());
                    double value2 = Double.parseDouble(boxTwo.getText());
                    double result = performDivision(value1, value2);
                    resultLabel.setText(String.valueOf(result));
                }
                catch (NumberFormatException error) {
                    resultLabel.setText("Only Numbers");
                }
            }
        });

        JButton sumButton = new JButton("+");
        sumButton.setBounds(300, 135, 45, 20);
        frame.add(sumButton);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(boxOne.getText());
                    double value2 = Double.parseDouble(boxTwo.getText());
                    double result = performAddition(value1, value2);
                    resultLabel.setText(String.valueOf(result));
                }
                catch (NumberFormatException error) {
                    resultLabel.setText("Only Numbers");
                }
            }
        });

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(300, 175, 45, 20);
        frame.add(subtractButton);

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(boxOne.getText());
                    double value2 = Double.parseDouble(boxTwo.getText());
                    double result = performSubtraction(value1, value2);
                    resultLabel.setText(String.valueOf(result));
                }
                catch (NumberFormatException error) {
                    resultLabel.setText("Only Numbers");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
