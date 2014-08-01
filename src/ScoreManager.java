
package boggleGame;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
//import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class ScoreManager 
{
    private ArrayList<Score> arrayScoreList = new ArrayList<Score>();

    public ScoreManager()
    {
        try (Scanner in = new Scanner(new File("scoring.txt")))
        {
            while (in.hasNextLine())
            {
        	String name = in.next();
        	int score = in.nextInt();
        	in.nextLine();
        	
        	arrayScoreList.add(new Score(name,score));
            }
        } catch (Exception e) 
        {
        	System.out.print("First time playing, no scores");
        }
    }

    public ArrayList<Score> getAllScores(){
        return arrayScoreList;
    }
}
