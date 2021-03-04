package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	frame.add(panel);
	JTextField firstText = new JTextField(3);
	JTextField secondText = new JTextField(3);
	panel.add(firstText);
	panel.add(secondText);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	add.setText("add");
	subtract.setText("subtract");
	multiply.setText("multiply");
	divide.setText("divide");
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	frame.pack();
	
}
}
