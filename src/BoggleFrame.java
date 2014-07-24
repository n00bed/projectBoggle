import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.border.BevelBorder;


@SuppressWarnings("serial")
public class BoggleFrame extends JFrame
{
	private JPanel startScreenPanel; 
	private JPanel gamePanel;
	
	public BoggleFrame() {
		getContentPane().setLayout(new CardLayout(0, 0));
	    this.setSize(600, 500);
		
		startScreenPanel = new JPanel();
		getContentPane().add(startScreenPanel, "name_1406241583084739000");
		startScreenPanel.setLayout(null);
		
		gamePanel = new JPanel();
		getContentPane().add(gamePanel, "name_1406241586540993000");
		gamePanel.setLayout(null);
		
		JButton btnStartGame = new JButton("START GAME");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startScreenPanel.setVisible(false);
				gamePanel.setVisible(true);
				
			}
		});
		btnStartGame.setFont(new Font("American Typewriter", Font.BOLD, 30));
		btnStartGame.setBounds(52, 204, 246, 221);
		startScreenPanel.add(btnStartGame);
		
		JTextArea gameNameLabel = new JTextArea();
		gameNameLabel.setLineWrap(true);
		gameNameLabel.setFont(new Font("American Typewriter", Font.BOLD, 40));
		gameNameLabel.setBackground(new Color(238,238,238));
		gameNameLabel.setText("THE ULTIMATE\n       BOGGLE");
		gameNameLabel.setBounds(14, 27, 357, 155);
		startScreenPanel.add(gameNameLabel);
		
		JTextArea txtrHighScore = new JTextArea();
		txtrHighScore.setLineWrap(true);
		txtrHighScore.setEditable(false);
		txtrHighScore.setFont(new Font("American Typewriter", Font.BOLD, 20));
		txtrHighScore.setText("      HIGH SCORE");
		txtrHighScore.setBounds(383, 27, 184, 392);
		startScreenPanel.add(txtrHighScore);
		
		
		
		JButton btnTestbutton = new JButton("TestButton");
		btnTestbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startScreenPanel.setVisible(true);
				gamePanel.setVisible(false);
			}
		});
		btnTestbutton.setBounds(236, 6, 117, 29);
		gamePanel.add(btnTestbutton);
		
		JLabel lblScore = new JLabel("  SCORE: ");
		lblScore.setFont(new Font("American Typewriter", Font.BOLD, 20));
		lblScore.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblScore.setBounds(16, 56, 200, 50);
		gamePanel.add(lblScore);
	}
}