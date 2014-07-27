import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoggleUtility
{

	public static Set<String> get_words()
	{
		Set<String> words = new HashSet<String>();

		// read one word at a time

		try
		{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(new File("src/Lexicon"));

			while (s.hasNextLine())
			{
				words.add(s.nextLine().toUpperCase());
			}
		} catch (FileNotFoundException e)
		{

			e.printStackTrace();
		}
		// add into words

		return words;

	}


}