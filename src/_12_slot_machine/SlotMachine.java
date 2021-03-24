package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel labelOne = new JLabel();
	JLabel labelTwo = new JLabel();
	JLabel labelThree = new JLabel();
	JButton spin = new JButton();
	int rand = 0;
	
	public void setup(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(labelOne);
		panel.add(labelTwo);
		panel.add(labelThree);
		panel.add(spin);
		spin.addActionListener(this);
		frame.pack();
		Random one = new Random();
		Random two = new Random();
		Random three = new Random();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			labelOne = createLabelImage("lime.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		frame.add(labelOne);
		frame.pack();
	}
	


private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}

}





