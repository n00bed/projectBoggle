/*
 * Author: Anil Dhungel & Matt Humphrey
 * CSIS 1410
 * ASSIGNMENT 09 - TEAM PROJECT - BOGGLE 
 */

/*
 * This class generates reads the word from lexicon file.
 */

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoggleUtility
{

	public static Set<String> get_words()
	{
		Set<String> words = new HashSet<String>();

		// read one word at a time

		InputStream is = BoggleUtility.class.getResourceAsStream("Lexicon.txt");
		Scanner s = new Scanner(is);

		while (s.hasNextLine())
		{
			// System.out.println(words);
			words.add(s.nextLine().toUpperCase());
		}
		s.close();
		return words;

	}

}