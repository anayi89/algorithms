import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aPlusB {  
	public static void main(String[] args) {
		JFrame a = new JFrame("A + B");

		JButton b = new JButton("Add a and b");
		
		JLabel c = new JLabel("A:");
		JLabel d = new JLabel("B:");
		JLabel f = new JLabel();
		
		JTextField g = new JTextField(9);
		JTextField h = new JTextField(9);

		a.add(b);
		a.add(c);
		a.add(d);
		a.add(f);
		a.add(g);
		a.add(h);
		a.setSize(250,200);
		a.setLayout(null);
		a.setVisible(true);

		b.setBounds(50, 100, 150, 30);
		c.setBounds(50, 20, 30, 30);
		d.setBounds(50, 60, 30, 30);
		f.setBounds(80, 100, 195, 70);
		g.setBounds(80, 20, 100, 30);
		h.setBounds(80, 60, 100, 30);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num_a = 0;
				int num_b = 0;
	
				try {
					String aStr = g.getText();
					num_a = Integer.parseInt(aStr);
				}
				catch (NumberFormatException i) {
					f.setText("A is not a number.");
					return;
				} // converts A from string to an integer

				try {
					String bStr = h.getText();
					num_b = Integer.parseInt(bStr);
				}
				catch (NumberFormatException i) {
					f.setText("B is not a number.");
					return;
				} // converts B from a string to an integer

				if(num_a < -1000) {
					throw new IllegalArgumentException("A must be greater than or equal to -1000.");
				}
				
				if(num_b > 1000) {
					throw new IllegalArgumentException("B must be less than or equal to 1000.");
				}
				
				f.setText(num_a  + " + " + num_b + " = " + (num_a + num_b));
			}
		}); // the action listener adds A and B when the button is pressed
	} // ends the public static void method
	
} // ends the ButtonExample() class