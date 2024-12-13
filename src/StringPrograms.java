
public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Java";
		String words[] = str.split(" ");
		for(String word : words)
		{
			System.out.println(word);
		}
		String concatenatedString = String.join("", words);
		System.out.println(concatenatedString);
	}

}
