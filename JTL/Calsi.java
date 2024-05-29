import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calsi extends JFrame implements ActionListener{

	JLabel num1Label, num2Label, resultLabel, operationsLabel;
	JTextField num1TField, num2TField, resultTField;
	JButton addButton, subButton;
	
	public Calsi(){
		setTitle("Calculator 2457");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		num1Label = new JLabel("Num 1:");
		num2Label = new JLabel("Num 2:");
		resultLabel = new JLabel("Result:");
		operationsLabel = new JLabel("Operations::");
		num1TField = new JTextField(20);
		num2TField = new JTextField(20);
		resultTField = new JTextField(21);
		addButton = new JButton("+");
		subButton = new JButton("-");
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		add(num1Label); add(num1TField);
		add(num2Label); add(num2TField);
		add(operationsLabel); add(addButton); add(subButton);
		add(resultLabel); add(resultTField);
		setSize(400,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		int num1 = Integer.parseInt(num1TField.getText());
		int num2 = Integer.parseInt(num2TField.getText());
		int result = 0;
		if (ae.getSource() == addButton){
			result = num1 + num2;
		}
		else if (ae.getSource() == subButton){
			result = num1 - num2;
		}
		resultTField.setText(result+"");
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Hi");
		Calsi myCalsi = new Calsi();
		//myCalsi.setVisible(true);
//		JOptionPane.showMessageDialog(null, "Hi", "Bye", JOptionPane.ERROR_MESSAGE);	
	
	}

}
