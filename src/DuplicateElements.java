import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]= {"Ranjith", "Java", "Raam", "Java", };
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate element is: "+names[i]);
				}
			}
		}
		System.out.println("******************");
		
		Set<String>set = new HashSet<String>();
		for(String name: names)
		{
			if(set.add(name)==true)
			{
				System.out.print(name+" ");
			}
		}
		
	}

}
