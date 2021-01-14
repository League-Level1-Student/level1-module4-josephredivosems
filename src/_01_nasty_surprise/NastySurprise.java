package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	 void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton treat = new JButton();
		JButton trick = new JButton();
		panel.add(treat);
		panel.add(trick);
		treat.addActionListener(this);
		trick.addActionListener(this);
		treat.setText("Treat");
		trick.setText("Trick");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
