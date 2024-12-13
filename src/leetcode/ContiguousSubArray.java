package leetcode;

import java.util.Iterator;

public class ContiguousSubArray {
	private static int contigousSubArray(int arr[]) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum > maxSum) {
				maxSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
	
	private static int contigousSubArray2(int arr[]) {
		int maxSum  =arr[0];
		int currentMax = arr[0];
		for(int i=0;i<arr.length;i++) {
			currentMax = Math.max(arr[i], currentMax+arr[i]);
			maxSum = Math.max(maxSum, currentMax);
		}
		return maxSum;
		
	}

	public static void main(String[] args) {
		int[] arr = { -1, -2, -3, -4 };
		System.out.println(contigousSubArray2(arr));
	}

}
