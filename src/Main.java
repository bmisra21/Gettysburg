import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Bharavi Misra
 *
 */

public class Main {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
        // assume filename stores the name of the file 
		List<String> words = new ArrayList<String>();
		while (file.hasNext()) 
		{
			String thing;
			thing = file.next();
			words.add(thing);
		} 
		/**for (int i=0; i<words.size(); i++)
		{
			System.out.println(words.get(i));
		} */
		double totalCount=0;
		String longest=words.get(0);
		for (int i=0; i<words.size(); i++)
		{
			int length;
			int location;
			if (words.get(i).contains("-"))
			{
				location =  words.get(i).indexOf("-");
				length = words.get(i).substring(0, location).length();
			}
			else if (words.get(i).contains("."))
			{
				location =  words.get(i).indexOf(".");
				length = words.get(i).substring(0, location).length();
			}
			else if (words.get(i).contains(","))
			{
				location =  words.get(i).indexOf(",");
				length = words.get(i).substring(0, location).length(); 
			} else {length = words.get(i).length();}
			if (length > longest.length())
				longest = words.get(i);
			totalCount = totalCount + words.get(i).length();
		}
		System.out.println("Avg word length: " +  totalCount/words.size());
		System.out.println("Longest word: " +  longest);

	}

}
