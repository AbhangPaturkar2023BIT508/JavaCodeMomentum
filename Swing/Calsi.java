import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class InvalidOperationException extends RuntimeException {
    public InvalidOperationException(String msg) {
        super(msg);
    }
}

public class Calsi implements ActionListener {
    private JFrame jf;
    private JLabel num1Lable, num2Label, resultLabel;
    private JTextField num1TField, num2TField, resultTField;
    private JButton addButton, subButton;

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
        // jf.add(resultLabel);
        // jf.add(resultTField);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) throws InvalidOperationException {
        System.out.println(e.getSource()==addButton);
        System.out.println(e.getActionCommand());
        int a = Integer.parseInt(num1TField.getText());
        int b = Integer.parseInt(num2TField.getText());
        switch (e.getActionCommand()) {
            case "+":
                JOptionPane.showMessageDialog(jf, (a + b) + "", "Result", JOptionPane.INFORMATION_MESSAGE);
                // resultTField.setText();
                break;

            // case "-":
            //     // resultTField.setText((a+b)+"");
            //     JOptionPane.showMessageDialog(jf, (a - b) + "", "Result", JOptionPane.INFORMATION_MESSAGE);
            //     break;

            default:
                // try {
                    throw new InvalidOperationException("Illegal Operator Used...");
                // } catch (Exception ex) {
                //     JOptionPane.showMessageDialog(jf, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
                // }
                // break;//
        }
        // resultTField.setText((a + b) + "");
        // System.out.println(e.getActionCommand());
    }

    public static void main(String[] args) {
        try {
            
            new Calsi();
        } catch (InvalidOperationException e) {
            // TODO: handle exception
            System.out.println("sdafkljsdsdfasdfjhsdfasfad");
        }
    }
}
