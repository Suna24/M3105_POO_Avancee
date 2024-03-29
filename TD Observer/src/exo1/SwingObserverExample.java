package exo1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Est-ce que je peux rater un cours ?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		// Set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Ne fais pas �a, tu pourrais �tre un jour d�faillant !");	
		}
		
	}
	
	class DevilListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Allez, vas-y, ce n'est qu'une petite absence non justifi�e de rien du tout !");
		}
	}

}
