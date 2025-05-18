import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EMICalculator extends JFrame {
    JTextField loanField, rateField, timeField;
    JLabel resultLabel;

    public EMICalculator() {
        setTitle("EMI Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        loanField = new JTextField();
        rateField = new JTextField();
        timeField = new JTextField();
        resultLabel = new JLabel("EMI: ");

        JButton calculateBtn = new JButton("Calculate");

        calculateBtn.addActionListener(e -> {
            try {
                double principal = Double.parseDouble(loanField.getText());
                double annualRate = Double.parseDouble(rateField.getText());
                int months = Integer.parseInt(timeField.getText());

                double monthlyRate = annualRate / 12 / 100;
                double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                             (Math.pow(1 + monthlyRate, months) - 1);

                resultLabel.setText("EMI: ₹" + String.format("%.2f", emi));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        add(new JLabel("Loan Amount (₹):"));
        add(loanField);
        add(new JLabel("Annual Interest Rate (%):"));
        add(rateField);
        add(new JLabel("Loan Term (months):"));
        add(timeField);
        add(new JLabel());
        add(calculateBtn);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EMICalculator();
    }
}
