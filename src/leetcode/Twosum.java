package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Twosum {

	// cur+x=target
	// x= target-cur
	// 3+x=10
	// x=10-3->7
	public static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int requiredNumber = target - arr[i];
			if (map.containsKey(requiredNumber)) {
				int newArray[] = { map.get(requiredNumber), i };
				return newArray;
			} else {
				map.put(arr[i], i);
			}
		}
		return new int[] {};

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 10;
		int[] result = twoSum(nums, target);
		if (result.length == 2) {
			System.out.println("Indices of two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
		}
		else {
			 System.out.println("No two numbers add up to " + target);
		}

	}

}
