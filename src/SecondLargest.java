import java.util.Arrays;

public class SecondLargest {
		
//	public static void moveEvenToLeft(int arr[])
//	{
//		//1,2,4,5,6
//		int even = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2==0)
//			{
//				int temp = arr[i];
//				arr[i]= arr[even];
//				arr[even] = temp;
//				even++;
//			}
//		}
//	}
	
	public static void moveLeft(int arr[])
	{
		int evenIndex = 0;
		//[1,3,2]
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				int temp = arr[i];
				for(int j=i;j>evenIndex;j--)
				{
					arr[j] = arr[j-1]; 
				}
				arr[evenIndex] = temp;
				evenIndex++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 2};
//		Arrays.sort(arr);
//		int highest = arr[arr.length-1];
//		for(int i=arr.length-2;i>=0;i--)
//		{
//			if(highest>arr[i])
//			{
//				System.out.println(arr[i]);
//				break;
		
		moveLeft(arr);
		for(int num:arr)
		{
			System.out.print(num+ " ");
		}
}
		
//selenium cucumber excection even left top enranked countries based on freaquencies collections

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[]= {1,323,222, 222, 33, 4};
//		Arrays.sort(arr);
//		
//		int highest = arr[arr.length-1];
//		for(int i=arr.length-2;i>=0;i--)
//		{
//			if(highest>arr[i])
//			{
//				System.out.println(arr[i]);
//				break;
//			}
//		}
//		
		
		
		
		
		
		
		
//		
//		Arrays.sort(array); //1,2,4,34,35,35;
//		int high = array.length-1;
//		int highest=array[array.length-1];
//		System.out.println("high: "+high);
//		System.out.println("highest: "+highest);
//		
//		for(int i=array.length-2;i>=0;i--) {
//			if(highest>array[i]) {
//				System.out.println(array[i]);
//				break;
//			}
//		}

	}