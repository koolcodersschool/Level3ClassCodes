package day7_8;

import javax.swing.*;
import javax.swing.text.AttributeSet.FontAttribute;

import java.awt.*;
import java.awt.event.*;

public class Calculator_DesktopApp_Koolcoders implements ActionListener{

	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subtractButton, multiplyButton, divideButton;
	JButton decimalButton, equalButton, deleteButton, clearButton, negativeButton;
	JPanel panel;
	
	Font myFont = new Font("Arial",Font.BOLD,30);
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
	
	public Calculator_DesktopApp_Koolcoders() {
		frame = new JFrame("Koolcoders Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		//create text field of Calculator
		textField = new JTextField();
		textField.setBounds(50,25,300,50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		//giving values to function buttons
		addButton = new JButton("+");
		subtractButton = new JButton("-");
		multiplyButton = new JButton("*");
		divideButton = new JButton("/");
		decimalButton = new JButton(".");
		equalButton = new JButton("=");
		deleteButton = new JButton("DEL");
		clearButton = new JButton("CE");
		negativeButton = new JButton("(-)");
		
		//adding above buttons to functionButtons array
		functionButtons[0] = addButton;
		functionButtons[1] = subtractButton;
		functionButtons[2] = multiplyButton;
		functionButtons[3] = divideButton;
		functionButtons[4] = decimalButton;
		functionButtons[5] = equalButton;
		functionButtons[6] = deleteButton;
		functionButtons[7] = clearButton;
		functionButtons[8] = negativeButton;
		
		for(int i = 0; i < 9; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		//adding number buttons
		for(int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		//set bounds to negative button, clear button, delete button
		negativeButton.setBounds(50, 430, 100, 50);
		deleteButton.setBounds(150, 430, 100, 50);
		clearButton.setBounds(250, 430, 100, 50);
		
		//create panel for number buttons and function buttons
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		//Add number buttons and function buttons into panel
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subtractButton);
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(multiplyButton);
		
		panel.add(decimalButton);
		panel.add(numberButtons[0]);
		panel.add(equalButton);
		panel.add(divideButton);
		
		
		//adding everything into frame in order to be able to see them
		frame.add(panel);
		frame.add(negativeButton);
		frame.add(deleteButton);
		frame.add(clearButton);
		frame.add(textField);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator_DesktopApp_Koolcoders calculator = new Calculator_DesktopApp_Koolcoders();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == decimalButton) {
			textField.setText(textField.getText().concat(String.valueOf(".")));
		}
		
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText() + "" + i);
			}
		}
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		
		if(e.getSource() == subtractButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		
		if(e.getSource() == multiplyButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		
		if(e.getSource() == divideButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		
		if(e.getSource() == equalButton) {
			num2 = Double.parseDouble(textField.getText());
			switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			
			textField.setText("" + result);
			num1 = result;
			
		}
		
		if(e.getSource() == clearButton) {
			textField.setText("");
		}
		
		if(e.getSource() == deleteButton) {
			String str = textField.getText();
			textField.setText("");
			for(int i = 0; i < str.length() - 1; i++) {
				textField.setText(textField.getText() + str.charAt(i));
			}
		}
		
		if(e.getSource() == negativeButton) {
			double temp = Double.parseDouble(textField.getText());
			temp *= -1;
			textField.setText("" + temp);
		}
		
	}
	
	

}
