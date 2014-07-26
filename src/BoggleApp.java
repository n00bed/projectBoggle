/*
 * TODO List 
 * 1. Solve for all possible word(Not doing that anymore, just checking the user input against lexicon) 
 * 2. Store all possible word to a  list ( not necessary since we are not creating all possible values)
 * 3. Get user input, if it is in a list , add it to the set( succesfully adding to the world list screen) 
 * 	users are only allowed to input word by clicking on the tiles. 
 * 4. Display the word on the screen and update score ( done) 
 * 5. When time is up or user hits done, show final score , write it to external .txt file. Still need to do that
 * 	  need to create a gameOver method, which resets the whole thing and starts from beginning. 
 * 	  When the new game is started, the wordlist from the last game is still on the display. 
 *
 * 6. Display the high score on the main screen from the .txt 
 * 
 * Fixes required:
 * 7. progress bar status not starting with start button click
 * 8. Figure out if the grid buttons can be created using 2D arrays. Last time we did that 
 * the [i][j] location of button couldn't be accession actionevent handler. 
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
