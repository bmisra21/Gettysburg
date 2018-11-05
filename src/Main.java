import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Bharavi Misra
 *
 */

public class Main {

	public static void main(String[] args) 
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
        // assume filename stores the name of the file 
		List<String> words = new ArrayList<String>();
		while (file.hasNext()) 
		{
			words = file.next();
		} 


	}

}
