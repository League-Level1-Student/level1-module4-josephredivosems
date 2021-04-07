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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel labelOne = new JLabel();
	JLabel labelTwo = new JLabel();
	JLabel labelThree = new JLabel();
	JButton spin = new JButton();
	int rand = 0;
	int ImageOne = 0;
	int ImageTwo = 0;
	int ImageThree = 0;
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
		ImageOne = one.nextInt(3);
		ImageTwo = two.nextInt(3);
		ImageThree = three.nextInt(3);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(ImageOne == 0) {
		try {
			labelOne = createLabelImage("lime.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(ImageOne == 1) {
			try {
				labelOne = createLabelImage("orange.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ImageOne == 2) {
			try {
				labelOne = createLabelImage("310305-bigthumbnail.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		frame.add(labelOne);
		labelOne.resize(100,100);
		frame.pack();
		if(ImageTwo == 0) {
			try {
				labelTwo = createLabelImage("lime.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		if(ImageTwo == 1) {
			try {
				labelTwo = createLabelImage("orange.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ImageTwo == 2) {
		try {
			labelTwo = createLabelImage("310305-bigthumbnail.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		frame.add(labelTwo);
		labelTwo.resize(100,100);
		frame.pack();
		if(ImageThree == 0) {
			try {
				labelThree = createLabelImage("lime.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		if(ImageThree == 1) {
			try {
				labelTwo = createLabelImage("orange.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		if(ImageThree == 2) {
			try {
				labelThree = createLabelImage("3130305-bigthumbnail.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		frame.add(labelThree);
		labelThree.resize(100,100);
		frame.pack();
	if(ImageOne == ImageTwo) {
		if(ImageTwo == ImageThree) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
	}
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





