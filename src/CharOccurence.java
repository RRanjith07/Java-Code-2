import java.awt.geom.Arc2D;
import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.Iterator;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class CharOccurence {
	static int charOccurence(String str, char ch)
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
		
	}
	static void charOccurence(String str)
	{
		//str = a2b3c1
		//aabbbc
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else {
				int x = Character.getNumericValue(str.charAt(i));
				for(int j =1;j<x;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
	static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!= s2.length())
		{
			return false;
		}
		else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string = "Ranjith";
//		for(int i =0;i<string.length();i++)
//		{
//			int count = charOccurence(string, string.charAt(i));
//			System.out.println("Character "+string.charAt(i)+": "+count);
//		}
		
		//charOccurence("a3b4c1d2");
		String s1 = "SILENT", s2 = "LISTEN";
		if(isAnagram(s1,s2))
		{
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		}
		else {
			System.out.println(s1 + " and " + s2 + " are not anagrams.");
		}
	}

}
