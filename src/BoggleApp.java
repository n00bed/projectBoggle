/*
 * TODO List 
 * 1. Solve for all possible word
 * 2. Store all possible word to a  list 
 * 3. Get user input, if it is in a list , add it to the set
 * 4. Display the word on the screen and update score
 * 5. When time is up or user hits done, show final score , write it to external .txt file
 * 6. Display the high score on the main screen from the .txt 
 */


import javax.swing.JFrame;


public class BoggleApp 
{
	public static void main( String[] args)
	{
		BoggleFrame frame = new BoggleFrame(); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
