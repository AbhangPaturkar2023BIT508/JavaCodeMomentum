import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calsi {
    private JFrame jf;
    private JLabel num1Lable, num2Label, resultLabel;
    private JTextField num1TField, num2TField, resultTField;
    private JButton addButton, subButton;
    private J

    public Calsi() {
        jf = new JFrame("Practice Calsi");
        num1Lable = new JLabel("Enter 1st Number");
        num2Label = new JLabel("Enter 2nd Number");
        resultLabel = new JLabel("Result");
        num1TField = new JTextField(10);
        num2TField = new JTextField(10);
        resultTField = new JTextField(10);
        resultTField.setEditable(false);
        addButton = new JButton("+");
        subButton = new JButton("-");
        jf.setLayout(new FlowLayout());
        jf.setSize(500, 500);
        jf.add(num1Lable);
        jf.add(num1TField);
        jf.add(num2Label);
        jf.add(num2TField);
        jf.add(addButton);
        jf.add(subButton);
        jf.add(resultLabel);
        jf.add(resultTField);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(num1TField.getText());
                int b = Integer.parseInt(num2TField.getText());
                resultTField.setText((a + b) + "");
            }
        });
    }

    public static void main(String[] args) {
        new Calsi();
    }
}
