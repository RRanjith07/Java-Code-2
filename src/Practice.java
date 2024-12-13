import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
	
	public static void findDuplicate(int arr[])
	{
		Set<Integer> mySet = new HashSet<Integer>();
		System.out.println("Duplicate Elements are:");
		for(int i=0;i<arr.length;i++)
		{
			if(mySet.add(arr[i])==false)
			{
				
				System.out.print(arr[i]+" ");
				
			}
		}
	}
	
	public static void findDuplicate(String str)
	{
		Set<Character> mySet = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(mySet.add(str.charAt(i))==false)
			{
				System.out.println(str.charAt(i));
			}
		}
	}
	
	public static void findDup(String str)
	{
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch)+1);
			}
			else {
				hMap.put(ch, 1);
			}
		}
		System.out.println(hMap);
	
		Set<Map.Entry<Character, Integer>> entrySet = hMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()<=1)
			{
				System.out.print(entry.getKey()+":"+entry.getValue()+" ");
			}
		}
	}
	public static String extractNumber(String str)
	{
		String numArray = "";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				numArray = numArray+str.charAt(i);
			}
		}
		System.out.println(numArray);
		return numArray;
	}
	
	public static void pallindrome(int num)
	{
		int actNum = num;
		int revNum =0;
		
		while(num!=0)
		{
			revNum = revNum*10 + num%10;
			num = num/10;
		}
		System.out.println(actNum);
		System.out.println(revNum);
		if(actNum==revNum)
		{
			System.out.println("Given Number "+actNum+ " is pallindrome");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7,8,1,3,4};
		//findDuplicate(arr);
		findDuplicate("RRaannjjiitthh");
		//findDup("December");
		
		//pallindrome(1331);
		
//		String res = extractNumber("16September2023");
//		int numbers = Integer.parseInt(res);
//		int sum = 0;
//		
//		while(numbers!=0)
//		{
//			sum = sum+numbers%10;
//			numbers = numbers/10;
//		}
//		System.out.println(sum);
	}

}
