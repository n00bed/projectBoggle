import java.util.Arrays;


public class BoggleBoard {
	
	private String[][] dieLetter; 
	public BoggleBoard()
	{
		dieLetter = new String[4][4]; 
		
		BoggleDice letter = new BoggleDice(); 
		
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<4; j++)
			{
				dieLetter[i][j] = letter.rollCube();
			}
				
		}
		
		//Testing that letters are properly adding to array 
		
		for(String [] el: dieLetter)
		{
			System.out.println(Arrays.toString(el));
		}
	}

}
