import java.util.LinkedHashMap;
import java.util.Map;

public class LargestSubstringwithoutRepchar {
	public static void largestString(String str)//abccaaacccddd
	{
		String largestString = null;
		int count = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch = str.charAt(i);
			
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else {
				i= map.get(ch);
				map.clear();
			}
			if(map.size()>count)
			{
				count = map.size();
				largestString = map.keySet().toString();
			}
		}
		System.out.println(largestString);
		System.out.println(count);
	}

	public static void main(String[] args) {
		largestString("abcdadd");
		
		

	}

}
