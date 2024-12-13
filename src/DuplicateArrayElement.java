import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayElement {
	public static void main(String[]args){
	int arr[] = {1,4,7,7,7,8,9};
	
	Set<Integer> mySet = new HashSet<Integer>();
	for (int i=0;i<arr.length;i++)
	{
		if(mySet.add(arr[i]))
		{
			System.out.println(arr[i]);
		}
	}

}
}
