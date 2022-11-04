package Tuto;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class raten {
	static int mynumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
	static int versuche = 0;
	static JLabel text = new JLabel("Deine Zahl zwischen 1 und 100:");
	static JTextField textf = new JTextField();
	static JLabel textv = new JLabel("Versuche: " + versuche);
	static JButton button = new JButton("Raten!");
	public static void main(String[] args) {
		openUI();
	}
	public static void openUI() {
		JFrame frame = new JFrame("Rate die Zahl!");
		frame.setSize(400, 300);
		frame.setLocation(1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultLookAndFeelDecorated(true);

		text.setBounds(50, 50, 400, 30);
		
		textv.setBounds(300, 0, 400, 30);
	

		
		textf.setBounds(50,150,200,30);
		
		
		button.setBounds(250,150,100,30);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String textftf = textf.getText();
				int number = Integer.parseInt(textftf);
				guess(number);
				} catch (Exception error) {
					text.setText("Bitte gebe eine Zahl ein!");
				}
			}
		});
		


		frame.add(text);
		frame.add(textf);
		frame.add(button);
		frame.add(textv);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	

	
	public static void guess(int number) {
		++versuche;
		if(number==mynumber) {
			
			text.setText("Richtig! Du hast " + versuche + " Versuche gebraucht!");
			textv.setText("");
			button.setEnabled(false);
			button.setVisible(false);
			
		}
		else {

			if(number<mynumber) {
		
				text.setText("Falsch geraten! Deine Zahl ist zu klein!");

			}
			else {
				text.setText("Falsch geraten! Deine Zahl ist zu groß!");

			}
			textf.setText("");
			textv.setText("Versuche: " + versuche);

	}
	}
}

