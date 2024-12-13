
public class Factorial {
	public static void main(String[] args) {
		System.out.println(MultiplyNum(5));

		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static int MultiplyNum(int num) {
		if (num >= 1) {
			return num * MultiplyNum(num - 1);
		} else {
			return 1;
		}
	}

}
