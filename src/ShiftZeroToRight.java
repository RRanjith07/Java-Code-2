import java.util.Arrays;
import java.util.Iterator;

public class ShiftZeroToRight {
	private static int[] shiftZeroToRight(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
		return arr;
	}
	
	private static int[] shiftZeroToLeft(int arr[]) {
		int j = arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if (arr[i]!=0) {
				arr[j] = arr[i];
				j--;
			}
		}
		while(j>=0) {
			arr[j]=0;
			j--;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 0, 0, 0, 0, 3, 8, 0, 9, 7, 5 };
		//System.out.println(Arrays.toString(shiftZeroToRight(arr)));
		System.out.println(Arrays.toString(shiftZeroToLeft(arr)));


	}

}
