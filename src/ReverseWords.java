
public class ReverseWords {

	public static void main(String[] args) {
		String msg = "Welcome to Java";
		String[] words = msg.split(" ");
		String revString="";
		System.out.println(msg);
		
		for(String word:words)
		{
			String revWord="";
			for(int i = word.length()-1;i>=0;i--)
			{
				revWord= revWord+word.charAt(i);
			}
			revString = revString+revWord+" ";
		}
		System.out.println(revString);
	}

}
