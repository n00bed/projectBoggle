import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


@SuppressWarnings("serial")
public class BoggleFrame extends JFrame
{
	private JPanel startScreenPanel; 
	private JButton btnStartGame; 
	private JTextArea txtrHighScore;
	private JPanel gamePanel;
	private JPanel wordListArea;
	private JPanel progressBar;
	private JPanel gameArea;
	private JPanel wordInputArea; 
	private JLabel lblScore;
	private JPanel wordListPanel;
	private JScrollPane scroll; 
	private JTextArea wordListTextArea;
	private JLabel lblEnterWord;
	private JTextField textField;
	private JProgressBar progressStatusBar;
	private Timer timer; 



	public BoggleFrame() {
		//Card Layout to hold both main screen and game screen and set the size of the screen  
		getContentPane().setLayout(new CardLayout(0, 0));
		this.setSize(600, 500);

		//Main screen that has start game button, high score and name of the game
		startScreenPanel = new JPanel();
		getContentPane().add(startScreenPanel, "name_1406241583084739000");
		startScreenPanel.setLayout(null);

		//Start button to start the game; 
		btnStartGame = new JButton("START GAME");
		btnStartGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startScreenPanel.setVisible(false);
				gamePanel.setVisible(true);

			}
		});
		btnStartGame.setFont(new Font("American Typewriter", Font.BOLD, 30));
		btnStartGame.setBounds(52, 204, 246, 221);
		startScreenPanel.add(btnStartGame);


		//Text area that displays the games name "THE ULTIMATE BOGGLE"
		JTextArea gameNameLabel = new JTextArea();
		gameNameLabel.setEditable(false);
		gameNameLabel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		gameNameLabel.setLineWrap(true);
		gameNameLabel.setFont(new Font("American Typewriter", Font.BOLD, 40));
		gameNameLabel.setBackground(new Color(238,238,238));
		gameNameLabel.setText("THE ULTIMATE\n       BOGGLE");
		gameNameLabel.setBounds(14, 27, 357, 155);
		startScreenPanel.add(gameNameLabel);

		//Text area to display HighScore
		txtrHighScore = new JTextArea();
		txtrHighScore.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtrHighScore.setLineWrap(true);
		txtrHighScore.setEditable(false);
		txtrHighScore.setFont(new Font("American Typewriter", Font.BOLD, 20));
		txtrHighScore.setText("      HIGH SCORE");
		txtrHighScore.setBounds(383, 27, 184, 392);
		startScreenPanel.add(txtrHighScore);

		//Actual game screen 
		gamePanel = new JPanel();
		getContentPane().add(gamePanel, "name_1406249004660584000");
		gamePanel.setLayout(new BorderLayout(0, 0));

		//Holds the panel for list entered by player and score while game is running 
		wordListArea = new JPanel();
		wordListArea.setPreferredSize(new Dimension(200, 350));
		gamePanel.add(wordListArea, BorderLayout.WEST);
		wordListArea.setLayout(null);

		//Label for holding score during gameplay 
		lblScore = new JLabel("  SCORE:");
		lblScore.setFont(new Font("American Typewriter", Font.BOLD, 16));
		lblScore.setHorizontalAlignment(SwingConstants.LEFT);
		lblScore.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblScore.setBounds(6, 30, 184, 50);
		wordListArea.add(lblScore);

		//Actual opanel that holds the word list 
		wordListPanel = new JPanel();
		wordListPanel.setBorder(new TitledBorder(null, "WordList ", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		wordListPanel.setBounds(6, 80, 188, 337);
		wordListArea.add(wordListPanel);
		wordListPanel.setLayout(new GridLayout(1, 0, 0, 0));

		//Text area where entered words are saved 
		wordListTextArea = new JTextArea();
		wordListPanel.add(wordListTextArea);

		//provides Scrollbar to  the wordlist text area
		scroll = new JScrollPane(wordListTextArea);
		wordListPanel.add(scroll); 

		//Progress bar panel to hold  the status bar 
		progressBar = new JPanel();
		progressBar.setPreferredSize(new Dimension(10, 30));
		gamePanel.add(progressBar, BorderLayout.NORTH);
		
		JLabel lblTimeLeft = new JLabel("TIME LEFT:");
		progressBar.add(lblTimeLeft);

		//progress bar to keep track of time 
		progressStatusBar = new JProgressBar();
		progressStatusBar.setStringPainted(true);
		
		progressStatusBar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		progressBar.add(progressStatusBar);
		progressStatusBar.setValue(100);
		ActionListener listener = new ActionListener() {
			int counter = 100;
			@Override
			public void actionPerformed(ActionEvent ae) {
				counter--;
				progressStatusBar.setString(counter+" seconds");
				progressStatusBar.setValue(counter);
				if (counter<1) {
					JOptionPane.showMessageDialog(null, "GameOver");
					timer.stop();
				} 
			}
		};
		timer = new Timer(1000, listener);
		timer.start();
		

		//Panel for actual game 
		gameArea = new JPanel();
		gameArea.setPreferredSize(new Dimension(200,200));
		gamePanel.add(gameArea, BorderLayout.CENTER);
		gameArea.setLayout(new GridLayout(4, 4, 5, 5));
		gameArea.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		
		
	
		JLabel[] squareButton = new JLabel[16];
		
		for(int i = 0; i < 16; i++)
		{
			squareButton[i] = new JLabel(new BoggleDice().rollCube().toUpperCase());  
			squareButton[i].setBackground(Color.CYAN);
			squareButton[i].setOpaque(true);
			squareButton[i].setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			squareButton[i].setHorizontalAlignment(SwingConstants.CENTER);
			squareButton[i].setFont(new Font("American Typewriter", Font.BOLD, 30));
			gameArea.add(squareButton[i]);
		}
		

		//Panel to hold Enter Word label, textfield and done button 
		wordInputArea = new JPanel(); 
		wordInputArea.setPreferredSize(new Dimension(10, 25));
		gamePanel.add(wordInputArea, BorderLayout.SOUTH);
		wordInputArea.setLayout(null);

		//Enterword label 
		lblEnterWord = new JLabel("Enter Word:");
		lblEnterWord.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterWord.setFont(new Font("American Typewriter", Font.BOLD, 16));
		lblEnterWord.setBounds(6, 0, 140, 20);
		wordInputArea.add(lblEnterWord);

		//Textfield for players to type word
		textField = new JTextField();
		textField.setBounds(169, 0, 300, 20);
		wordInputArea.add(textField);
		textField.setColumns(10);

		//Done button to end the game
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(477, 0, 117, 20);
		wordInputArea.add(btnDone);




	}
}