

import java.util.*;
import java.io.*;

public class HighScore 
{
	private ArrayList<Score> scores;
	
	private static final String HIGHSCORE_FILE = "allhighscores.dat";
	
	ObjectOutputStream outputStream = null;
	ObjectInputStream inputStream = null;
	
	public HighScore()
	{
		scores = new ArrayList<Score>();
	}
	
	public ArrayList<Score> getScores()
	{
		loadScoreFile();
		sort();
		return scores;
	}
	
	private void sort()
	{
		//may need to make a new class
		Collections.sort(scores);
	}
	
	public void addScore(String name, int score) 
	{
        loadScoreFile();
        scores.add(new Score(name, score));
        updateScoreFile();
	}
	@SuppressWarnings("unchecked")
	public void loadScoreFile() 
	{
        try {
            inputStream = new ObjectInputStream(new FileInputStream(HIGHSCORE_FILE));
            scores = (ArrayList<Score>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("[Laad] FNF Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[Laad] IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[Laad] CNF Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("[Laad] IO Error: " + e.getMessage());
            }
        }
	}
	
	public void updateScoreFile() 
	{
        try 
        {
            outputStream = new ObjectOutputStream(new FileOutputStream(HIGHSCORE_FILE));
            outputStream.writeObject(scores);
        } catch (FileNotFoundException e) {
            System.out.println("[Update] FNF Error: " + e.getMessage() + ",the program will try and make a new file");
        } catch (IOException e) {
            System.out.println("[Update] IO Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("[Update] Error: " + e.getMessage());
            }
        }
	}	
	
	public String getHighscoreString() {
        String highscoreString = "";
        int max = 10;

        ArrayList<Score> scores;
        scores = getScores();

        int i = 0;
        int x = scores.size();
        if (x > max) {
            x = max;
        }
        while (i < x) {
            highscoreString += (i + 1) + ".\t" + scores.get(i).getTheNames() + "\t\t" + scores.get(i).getScore() + "\n";
            i++;
        }
        return highscoreString;
}
	

}
