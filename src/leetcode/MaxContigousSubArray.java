package leetcode;

import java.util.HashSet;

public class MaxContigousSubArray {
	private static int maxContigousArray(String s) {
		// abbbbcdddd
		int start = 0;
		int end = 0;
		int sum = 0;
		HashSet<Character> set = new HashSet<>();
		
		
		while(end<s.length()) {
			char ch = s.charAt(end);
			if (!set.contains(ch)) {
				set.add(ch);
				end++;
				sum = Math.max(sum, set.size());
			}
			else {
				set.remove(s.charAt(start));
				start++;
			}
			
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(maxContigousArray("abcabcbb"));

	}

}
