import java.util.Iterator;

public class CapatilaizeEachWord {
	
	public static void capitalizeWord(String str)
	{
		//Str = "welcome to java programming";
		String [] words = str.split(" ");
		String result = "";
		for(String word : words) {
			//welcome
			String firstWord = word.substring(0,1).toUpperCase();
			String remWords = word.substring(1);
			result = result + firstWord+remWords+" ";
		}
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		capitalizeWord("welcome to java programming");
	}

}
