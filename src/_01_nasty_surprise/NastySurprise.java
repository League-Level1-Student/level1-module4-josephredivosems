package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton treat = new JButton();
	JButton trick = new JButton();
	JLabel treatimage = new JLabel();
	JLabel trickimage = new JLabel();
	 void run() {

		frame.add(panel);
		frame.setVisible(true);

		panel.add(treat);
		panel.add(trick);
		treat.addActionListener(this);
		trick.addActionListener(this);
		treat.setText("Treat");
		trick.setText("Trick");
		frame.pack();
		String cutePuppy = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=0.752xw:1.00xh;0.175xw,0&resize=640:*";
		ImageIcon icon = new ImageIcon(cutePuppy); 
		treatimage.setIcon(icon);
		String scaryImage = "https://static.wikia.nocookie.net/coraline/images/c/cd/The_Beldam%27s_Third_Form.jpg/revision/latest/scale-to-width-down/340?cb=20150521000535";
		ImageIcon icontwo = new ImageIcon(scaryImage);
		trickimage.setIcon(icontwo);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == treat) {
			panel.add(treatimage);
			frame.pack();
		}
		else if(arg0.getSource() == trick) {
			panel.add(trickimage);
			frame.pack();
		}
	}
}
