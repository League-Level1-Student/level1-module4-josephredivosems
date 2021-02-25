package _06_book_of_illusions;

import java.awt.Label;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
	JLabel label;
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frame = new JFrame();
	public void run() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String imageOne = "image-analysis.png";
		String imageTwo = "image_created_with_a_mobile_phone.png";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
	    label = loadImageFromComputer(imageOne);
		// 8. add your JLabel to the frame
	    frame.add(label);
		// 9. call the pack() method on the frame
	    frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
	    frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		frame.remove(label);
		// 13. load a new image like before (this is more than one line of code)
		String imageTwo = "Image_created_with_a_mobile_phone.png";
		JLabel labelTwo;
		labelTwo = loadImageFromComputer(imageTwo);
		// 14. pack the frame
		frame.add(labelTwo);
	
		frame.pack();
		
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


