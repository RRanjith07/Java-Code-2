package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGivenSum {

	private static List<Integer> subarraySum(int[] arr, int target) {
		int start = 0;
		int end = 0;
		int currentSum = 0;

		while (end < arr.length) {
			currentSum = currentSum + arr[end];

			while (currentSum > target && start <= end) {
				currentSum = currentSum - arr[start];
				start++;
			}
			if (currentSum == target) {
				List<Integer> list = new ArrayList<>();
				for (int i = start; i <= end; i++) {
					list.add(arr[i]);
				}
				return list;
			}
			end++;
		}
		return new ArrayList<>(); // Return empty list if no subarray found
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 7, 5};
	        int target = 17;
	        List<Integer> result = subarraySum(arr, target);
	        if (!result.isEmpty()) {
	            System.out.println("Subarray with the given sum: " + result);
	        } else {
	            System.out.println("No subarray with the given sum found.");
	        }

	}

}
