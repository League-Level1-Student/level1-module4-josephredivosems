package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	private JButton joke;
	private JButton punchline;
	private JFrame frame;
	private JPanel panel;
	public void makeButtons() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.setText("joke");
		punchline.setText("punchline");
		frame.pack();
		joke.addActionListener(this);
		punchline.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == joke) {
			System.out.println("Funny joke");
		}
		else if(arg0.getSource() == punchline) {
			System.out.println("Great losses are great lessons");
		}
	}
	}

