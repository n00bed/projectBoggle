/*
 * Author: Anil Dhungel & Matt Humphrey
 * CSIS 1410
 * ASSIGNMENT 09 - TEAM PROJECT - BOGGLE 
 */

/*
 * This class reads from the file scoring.txt.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreManager
{
	private ArrayList<Score> arrayScoreList = new ArrayList<Score>();

	public ScoreManager()
	{
		try (Scanner in = new Scanner(new File("score.txt")))
		{
			while (in.hasNextLine())
			{
				String name = in.next();
				int score = in.nextInt();
				in.nextLine();

				arrayScoreList.add(new Score(name, score));
			}
		} catch (Exception e)
		{
			System.out.print("First time playing, no scores");
		}
	}

	public ArrayList<Score> getAllScores()
	{
		
		return arrayScoreList;
	}

	public void writeFile(String test)
	{

		BufferedWriter out;
		try
		{
			out = new BufferedWriter(new FileWriter("score.txt"));
			out.write(test);
			out.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
