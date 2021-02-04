package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	private JLabel label;
		void setup(){
         JFrame frame = new JFrame();
         JPanel panel = new JPanel();
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
			if(arg0.equals(currentLetter)) {
				currentLetter = null;
			}
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
    
}
