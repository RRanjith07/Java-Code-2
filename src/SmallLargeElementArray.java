
public class SmallLargeElementArray {

	public static void main(String[] args) {
		
		int array[]= {23,45,66,7,89,990};
		
		int largest = array[0];
		int smallest = array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
			else if( array[i]<smallest)
			{
				smallest= array[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
		
		

	}

}
