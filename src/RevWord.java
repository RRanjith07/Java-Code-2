public class RevWord {
	
	public static void m1(String str)
	{
		String resultString="";
		String words[] = str.split(" ");
		for(String word: words)
		{
			String firstLetter = word.substring(0,1).toUpperCase();
			String remLetter = word.substring(1);
			resultString = resultString+firstLetter+remLetter+" ";
		}
		System.out.println(resultString);
	}

	public static void main(String[] args) {
		m1("welcome to java programming");			
	}
}
