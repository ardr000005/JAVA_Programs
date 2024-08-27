

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class PrimeChecker extends JFrame {
    private JTextField textField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PrimeChecker() {
        setTitle("Prime Number Checker");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField(10);
        checkButton = new JButton("Check");
        resultLabel = new JLabel();

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                try {
                    int number = Integer.parseInt(input);
                    if (isPrime(number)) {
                        resultLabel.setText(number + " is a prime number.");
                    } else {
                        resultLabel.setText(number + " is not a prime number.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(new JLabel("Enter a number:"));
        panel.add(textField);
        panel.add(checkButton);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimeChecker().setVisible(true);
            }
        });
    }
}

