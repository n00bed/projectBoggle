package boggleGame;

public class Score 
implements Comparable<Score>
{
	/**
	 * @author Matt & Anil
	 * 
	 */
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
		return theNames+"\t "+score; 
	}
}
