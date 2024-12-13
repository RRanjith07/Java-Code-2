import java.util.Arrays;

public class AnagramString {
	public static void removeChar(String str)
	{
		String res ="";
		for(int i=1;i<str.length()-1;i++)
		{
			res = res +str.charAt(i);	
		}
		System.out.println(res);
	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}
	public static void main(String[] args) {
		//removeChar("Ranjith");
		
		//TODO Auto-generated method stub
		boolean res = isAnagram("abcd", "acdb");
		if(res==true)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
	}

}
