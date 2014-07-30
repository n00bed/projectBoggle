import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


@SuppressWarnings("serial")
public class BoggleFrame extends JFrame
{

	private JPanel gamePanel;
	private JPanel wordListArea;
	private JPanel progressBar;
	private JPanel gameArea;
	private JPanel wordInputArea;
	private JPanel wordListPanel;
	private JPanel startScreenPanel;

	private JLabel lblScore;
	private JLabel lblEnterWord;

	private JTextArea wordListTextArea;
	private JTextArea txtrHighScore;

	private JTextField textField;
	private JButton btnStartGame;

	private BoggleButton buttons[][];

	private JScrollPane scroll;
	private JProgressBar progressStatusBar;

	private String currentWord = "";
	private int score;
	
	private final Border clickBorder= new LineBorder(Color.RED, 5);
	private final Border unclickborder= new LineBorder(Color.BLACK, 5);
	
	private JButton btnSubmit; 
	private String theNames; 
	
	
	private Set<String> words = new HashSet<String>();
	private Set<String> wordsDisplay = new HashSet<String>();
	private ArrayList<Score > scoretrack; 
	private JLabel lblHighScores;
 
	

	public BoggleFrame()
	{
		// Card Layout to hold both main screen and game screen and set the size of the screen
		getContentPane().setLayout(new CardLayout(0, 0));
		this.setSize(600, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		// Main screen that has start game button, high score and name of the
		// game
		startScreenPanel = new JPanel();
		startScreenPanel.setForeground(Color.BLACK);
		startScreenPanel.setBackground(new Color(100,150,200));
		getContentPane().add(startScreenPanel, "name_1406241583084739000");
		startScreenPanel.setLayout(null);

		// Start button to start the game;
		btnStartGame = new JButton("START GAME");
		btnStartGame.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{

				startScreenPanel.setVisible(false);
				gamePanel.setVisible(true);
				score = 0;
				lblScore.setText("SCORE: " + score);
				wordListTextArea.setText("");
				Task task = new Task();
				task.start();
				
			}

		});

		btnStartGame.setFont(new Font("American Typewriter", Font.BOLD, 30));
		btnStartGame.setBounds(14, 204, 357, 221);
		startScreenPanel.add(btnStartGame);


		// Text area that displays the games name "THE ULTIMATE BOGGLE"
		JTextArea gameNameLabel = new JTextArea();
		gameNameLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null));
		gameNameLabel.setEditable(false);
		gameNameLabel.setLineWrap(true);
		gameNameLabel.setFont(new Font("American Typewriter", Font.BOLD, 40));
		gameNameLabel.setBackground(new Color(100, 150, 200));
		gameNameLabel.setText("THE ULTIMATE\n       BOGGLE");
		gameNameLabel.setBounds(14, 27, 357, 155);
		startScreenPanel.add(gameNameLabel);

		// Text area to display HighScore
		txtrHighScore = new JTextArea();
		txtrHighScore.setBorder(new EtchedBorder(EtchedBorder.RAISED, null,
				null));
		txtrHighScore.setLineWrap(true);
		txtrHighScore.setEditable(false);
		txtrHighScore.setFont(new Font("American Typewriter", Font.BOLD, 20));
		txtrHighScore.setBounds(383, 73, 184, 352);
		startScreenPanel.add(txtrHighScore);
		
		//label that holds high score
		lblHighScores = new JLabel("HIGH SCORES");
		lblHighScores.setFont(new Font("American Typewriter", Font.BOLD, 20));
		lblHighScores.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighScores.setBounds(383, 41, 184, 16);
		startScreenPanel.add(lblHighScores);
		
	

		// Actual game screen
		gamePanel = new JPanel();
		getContentPane().add(gamePanel, "name_1406249004660584000");
		gamePanel.setLayout(new BorderLayout(0, 0));

		// Holds the panel for list entered by player and score while game is
		// running
		wordListArea = new JPanel();
		wordListArea.setPreferredSize(new Dimension(200, 350));
		gamePanel.add(wordListArea, BorderLayout.WEST);
		wordListArea.setLayout(null);

		// Label for holding score during gameplay
		lblScore = new JLabel("  SCORE: " + score);
		lblScore.setFont(new Font("American Typewriter", Font.BOLD, 16));
		lblScore.setHorizontalAlignment(SwingConstants.LEFT);
		lblScore.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblScore.setBounds(6, 30, 184, 50);
		wordListArea.add(lblScore);

		// Actual opanel that holds the word list
		wordListPanel = new JPanel();
		wordListPanel
				.setBorder(new TitledBorder(null, "WordList ",
						TitledBorder.CENTER, TitledBorder.TOP, null, new Color(
								0, 0, 0)));
		wordListPanel.setBounds(6, 80, 188, 337);
		wordListArea.add(wordListPanel);
		wordListPanel.setLayout(new GridLayout(1, 0, 0, 0));

		// Text area where entered words are saved
		wordListTextArea = new JTextArea();
		wordListPanel.add(wordListTextArea);

		// provides Scrollbar to the wordlist text area
		scroll = new JScrollPane(wordListTextArea);
		wordListPanel.add(scroll);

		// Progress bar panel to hold the status bar
		progressBar = new JPanel();
		progressBar.setPreferredSize(new Dimension(10, 30));
		gamePanel.add(progressBar, BorderLayout.NORTH);

		// Label that displays time left
		JLabel lblTimeLeft = new JLabel("TIME LEFT:");
		progressBar.add(lblTimeLeft);

		// progress bar to keep track of time
		progressStatusBar = new JProgressBar();
		progressStatusBar.setString("100 seconds");
		progressStatusBar.setStringPainted(true);
		progressStatusBar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null,
				null));
		progressBar.add(progressStatusBar);
		progressStatusBar.setValue(100);

		// Panel for actual game
		gameArea = new JPanel();
		gameArea.setPreferredSize(new Dimension(200, 200));
		gamePanel.add(gameArea, BorderLayout.CENTER);
		gameArea.setLayout(new GridLayout(4, 4, 5, 5));
		gameArea.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		// build Grid builds Array of 16 labels , board where the random letter
		// are generated , words holds all the words from lexicon
		words = BoggleUtility.get_words();
		buildGrid();

		// Panel to hold Enter Word label, textfield and done button
		wordInputArea = new JPanel();
		wordInputArea.setPreferredSize(new Dimension(10, 25));
		gamePanel.add(wordInputArea, BorderLayout.SOUTH);
		wordInputArea.setLayout(null);

		// Enterword label
		lblEnterWord = new JLabel("Your Word:");
		lblEnterWord.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterWord.setFont(new Font("American Typewriter", Font.BOLD, 16));
		lblEnterWord.setBounds(6, 0, 140, 20);
		wordInputArea.add(lblEnterWord);

		// Textfield for players to display clicked word
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(171, 1, 300, 20);
		wordInputArea.add(textField);
		textField.setColumns(10);

		// Submit button to submit and add the word to side textarea
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(477, 0, 117, 20);
		btnSubmit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{

				if (words.contains(currentWord))
				{
					if (!(wordsDisplay.contains(currentWord)))
					{
						score += currentWord.length();
						lblScore.setText("SCORE: " + score);
					} else
					{
						JOptionPane.showMessageDialog(null, "Already used");
					}
					wordsDisplay.add(currentWord);

				} else
				{
					JOptionPane.showMessageDialog(null,
							"Invalid word. No score will be awarded");
				}

				currentWord = "";
				wordListTextArea.setText(getwordsDisplay() + "\n");

				// Enables all the buttons that were disable when user input the
				// last words
				for (int i = 0; i < buttons.length; i++)
				{
					for (int j = 0; j < buttons.length; j++)
					{
						buttons[i][j].setEnabled(true);
						buttons[i][j].setBorder(new LineBorder(Color.BLACK, 5));
					}
				}

			}
		});
		wordInputArea.add(btnSubmit);
	}

	//Creating 16 boards
	private void buildGrid()
	{

		buttons = new BoggleButton[4][4];
		
		BoggleButton.init(buttons);
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				buttons[i][j] = new BoggleButton(i, j);
				buttons[i][j].setText(new BoggleDice().rollCube().toUpperCase());
				buttons[i][j].setBorder(unclickborder);
				buttons[i][j].setFont(new Font("American Typewriter",
						Font.BOLD, 30));
				final int buttonRow = i;
				final int buttonColumn = j;
				//ActionListener listener = new BoggleEventHandler(buttons);
				//buttons[i][j].addActionListener(listener);
				buttons[i][j].addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{

						currentWord += buttons[buttonRow][buttonColumn]
								.getText();
						textField.setText(currentWord);
						buttons[buttonRow][buttonColumn].setEnabled(false);
						buttons[buttonRow][buttonColumn].setBorder(clickBorder);
						buttons[buttonRow][buttonColumn].setOpaque(false);

					}
				});
				gameArea.add(buttons[i][j]);
			}
		}
	}

	private class Task extends Thread
	{
		public Task()
		{
		}

		public void run()
		{
			for (int i = 10; i >= 0; i--)
			{
				final int progress = i;
				final int counter = i;
				SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{

						progressStatusBar.setString("" + progress + " seconds");
						progressStatusBar.setValue(progress);
						if (counter <= 0)
						{	
							gameOver(); 														
						}

					}
				});
				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
				}
			}
		}
	}

	// Returns word from set wordsDisplay
	private String getwordsDisplay()
	{
		String return_value = "";
		for (String s : wordsDisplay)
		{
			return_value += s.toString() + "\n";
		}

		return return_value;
	}
	

	private void gameOver()
	{
		 	//JOptionPane.showMessageDialog(null, "GameOver.\n You scored: " + score+" ");
			
			theNames  = JOptionPane.showInputDialog(null, "GameOver.\n You scored: " + score+ "\n Please Enter your name: ");
			
			scoretrack= new ArrayList<Score>(Arrays.asList(new Score(theNames, score)));
			
			//Read in HighScores and add new scores.
			
			//scoretrack.add(new Score(theNames, score));
			// ^ ^ Score is being added twice.
			startScreenPanel.setVisible(true);
			gamePanel.setVisible(false);
			wordsDisplay.clear();
			currentWord=""; 
			txtrHighScore.setText(getScoreName());
				
			textField.setText(currentWord);
		for (int i = 0 ; i <4; i++)
		{
			for (int j = 0; j<4; j++)
			{
			buttons[i][j].setEnabled(true);
			buttons[i][j].setBorder(unclickborder);	
			buttons[i][j].setText(new BoggleDice().rollCube().toUpperCase());
			}
		}
	}
	
	private String getScoreName()
	{
		String temp = ""; 
		for(Score el : scoretrack)
			temp += el.toString() + "\n";
		
		return temp+=temp; 
	}
}
