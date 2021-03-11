package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField firstText = new JTextField(2);
	JTextField secondText = new JTextField(2);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JLabel label = new JLabel();

	
	
public void setup() {
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(firstText);
	panel.add(secondText);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(label);
	add.setText("add");
	subtract.setText("subtract");
	multiply.setText("multiply");
	divide.setText("divide");
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	frame.pack();
}
public void add(int first,int second) {
	int sum = first+=second;
	label.setText("" + sum);
	frame.pack();
}
public void subtract(int first,int second) {
	int difference = first-=second;
	label.setText("" + difference);
}
public void multiply(int first,int second) {
	int product = first*second;
	label.setText("" + product);
}
public void divide(int first, int second) {
	int quotient = first/second;
	label.setText("" + quotient);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	int first = Integer.parseInt(firstText.getText());
	int second = Integer.parseInt(secondText.getText());
	if(arg0.getSource() == add) {
		add(first,second);
	}
	if(arg0.getSource() == subtract) {
		subtract(first,second);
	}
	if(arg0.getSource() == multiply) {
		multiply(first,second);
	}
	if(arg0.getSource() == divide) {
		divide(first,second);
	}
}
}

