package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField firstText = new JTextField(10);
	JButton button = new JButton();
	JTextField secondText = new JTextField(10);
	
	public void setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(firstText);
		panel.add(button);
		panel.add(secondText);
		button.setText("translate");
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		PigLatinTranslator translate = new PigLatinTranslator();
		
		
	}
	
}
;