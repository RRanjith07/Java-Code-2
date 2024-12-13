
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	static String path ="C:/Users/hp/OneDrive/Desktop/Test.txt";

	public static void main(String[] args) throws IOException {
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String currentLine = reader.readLine();
		while(currentLine!=null)
		{
			lineCount++;
			//words count
			String words[] = currentLine.split(" ");
			wordCount = wordCount+words.length;
			currentLine = reader.readLine();
			//char count
			for(String word: words)
			{
				charCount = charCount+word.length();
			}
		}
		System.out.println("Total Line: "+lineCount);
		System.out.println("Total Word: "+wordCount);
		System.out.println("Total Char: "+charCount);
	}
}
