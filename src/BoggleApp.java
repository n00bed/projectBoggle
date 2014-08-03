/*
 * Author: Anil Dhungel & Matt Humphrey
 * CSIS 1410
 * ASSIGNMENT 09 - TEAM PROJECT - BOGGLE 
 */

/*
 * This is the main class for the Boggle game. 
 * It creates a new instance of BoggleFrame class and sets it visible
 * to screen. 
 */

import javax.swing.JFrame;

public class BoggleApp
{
	public static void main(String[] args)
	{
		BoggleFrame frame = new BoggleFrame();
		frame.setTitle("BOGGLE");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
