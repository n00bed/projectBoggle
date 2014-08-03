/*
 * Author: Anil Dhungel & Matt Humphrey
 * CSIS 1410
 * ASSIGNMENT 09 - TEAM PROJECT - BOGGLE 
 */
/*
 * This class creates and new file scoring.txt.
 */

import java.util.*;

public class CreateFile {

		private Formatter x;
		
		public void openFile(){
			try{
				x = new Formatter("scoring.txt");
			}
			catch (Exception e)
			{
				System.out.println("Unable to create or add file");
				
			}
		}
		
		
		public void closeFile()
		{
			x.close();
		}
	}
