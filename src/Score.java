/*
 * Author: Anil Dhungel & Matt Humphrey
 * CSIS 1410
 * ASSIGNMENT 09 - TEAM PROJECT - BOGGLE 
 */

/*
 * This class has getter method for name and score that can be written screen 
 */

public class Score 
implements Comparable<Score>
{

	private int score;
	private String theNames;
	
	public int getScore()
	{
		return score;
	}
	
	public String getTheNames()
	{
		return theNames;
	}
	
	public Score(String theNames, int score)
	{
		this.score = score;
		this.theNames = theNames;
	}
	
	@Override
	public int compareTo(Score score1)
	{
		return ((Integer)(score1.getScore())).compareTo(getScore());
	}
	
	@Override
	public String toString()
	{
		return theNames+"\t  "+score; 
	}
}
