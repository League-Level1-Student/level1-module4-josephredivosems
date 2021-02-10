package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	private JLabel label = new JLabel();
	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();
		void setup(){
        
         frame.setVisible(true);
 
         currentLetter = generateRandomLetter();
         label.setText("" + currentLetter);
         label.setFont(label.getFont().deriveFont(28.0f));
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.addKeyListener(this);
         frame.add(panel);
         panel.add(label);
         frame.pack();
         }
		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
		
		char pressed = arg0.getKeyChar();
		if(pressed == currentLetter) {
			System.out.println("Correct!");
			panel.setBackground(GREEN);
		}
		else {
			panel.setBackground(RED);
		}
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			currentLetter = generateRandomLetter();
			label.setText("" + currentLetter);
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
    
}
