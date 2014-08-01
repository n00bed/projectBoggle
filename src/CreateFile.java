package boggleGame;

import java.io.*;
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
		
//		public void addRecords()
//		{
		
//			x.format("%s,%s",getTheNames,getScores);
//		}
		
		public void closeFile()
		{
			x.close();
		}
	}
