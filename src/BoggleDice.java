
public class BoggleDice {
	private static String[] bigBoggleCubes = {
		"aaafrs", "aaeeee", "aafirs", "adennn", "aeeeem",
		"aeegmu", "aegmnn", "afirsy", "bjkqxz", "ccnstw",
		"ceiilt", "ceilpt", "ceipst", "ddlnor", "ddhnot",
		"dhhlor", "dhlnor", "eiiitt", "emottt", "ensssu",
		"fiprsy", "gorrvw", "hiprry", "nootuw", "ooottu"		
	};
	private static int numBigBoggleCubes = bigBoggleCubes.length;
	private static int numCubesCreated = 0;
	private String letter;
	private int cubeID;
	
	
	public BoggleDice() {
		cubeID = numCubesCreated % numBigBoggleCubes;
		numCubesCreated++;
	}
	
	//Creating random letter by rolling cube
	public String rollCube() {
		int index = (int) (Math.random() * bigBoggleCubes[cubeID].length());
		letter = bigBoggleCubes[cubeID].substring(index, index + 1);
		if(letter.equals("q"))
			letter = "qu";
		return letter;
	}
	
	//returns letter for the cube 
	public String getLetter() {
		return letter;
	}
	
	//will return the id of the cube 
	public int getID() {
		return cubeID;
	}
}

