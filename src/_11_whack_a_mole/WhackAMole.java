package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	JButton moleButton;
	JButton button;
	int ran;
	int whackedMoles = 0;
	int moles = 0;
	
	public void setup() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		
		ran = rand.nextInt(25);
		drawButtons(ran);
		frame.pack();
	}
	public void drawButtons(int moleLocation) {
	
			
		
		for (int i = 0; i < 25; i++) {
			button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i == moleLocation) {
				moleButton = button;
				moleButton.setText("mole");
			}
			else {
				button.setText("");
			}
			
		
		}
		frame.setSize(300,500);
		}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		whackedMoles++;
		if(arg0.getSource() == button) {
			JOptionPane.showMessageDialog(null, "You missed!");
		}
		if(arg0.getSource() == moleButton) {
			moles++;
			System.out.println("mole up");
		}
		frame.dispose();
		if(whackedMoles == 10) {
			endGame(new Date(),moles);
		}
		else {
			setup();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
}
