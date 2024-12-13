public class PrimeNumber {

	private static boolean isPrime(int number) {

		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void printPrime(int range) {// 10
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		printPrime(10);
	}

//		int number = 2;
//		if(isPrime(number)) {
//			System.out.println(number+" is Prime Number");
//		}
//		else {
//			System.out.println(number+" is Not a Prime Number");
//		}
//	}

//		int number =73;
//		boolean flag =true;
//		if(number==0 || number ==1)
//		{
//			System.out.println(number+" is not a Prime Number");
//		}
//		for (int i=2;i<number/2;i++)
//		{
//			if(number%i==0)
//			{
//				System.out.println(number+" is not a Prime Number");
//				flag=false;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println(number+" is a Prime Number");
//		}
//
//	}

}
