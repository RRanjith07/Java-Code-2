public class CharPercentage {
	
	public static void charPercentage(String str)
	{
		int upperCaseCount =0;
		int lowerCaseCount =0;
		int digits =0;
		int specialChars =0;
		int len = str.length();
		for(int i=0; i<len;i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else {
				specialChars++;
			}
		}
		double upperCasePercentage = ((upperCaseCount*100)/len);
		double lowerCasePercentage = ((lowerCaseCount*100)/len);
		double digitsPercentage = ((digits*100)/len);
		double specialCharsPercentage = ((specialChars*100)/len);
		System.out.println("The Uppercase found: "+upperCasePercentage);
		System.out.println("The lowercase found: "+lowerCasePercentage);
		System.out.println("The digits found: "+digitsPercentage);
		System.out.println("The special charecters found: "+specialCharsPercentage);
	}

	public static void main(String[] args) {
		charPercentage("Ranjithkokkarne07@gmail.com @##@");

	}

}
