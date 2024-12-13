public class ArmStrongNumber {

	public static void armStrong(int num) {
		int actNum = num;
		double res = 0;
		// 371
		while (actNum != 0) {
			int base = actNum % 10;
			res = res + Math.pow(base, 3);
			actNum = actNum / 10;
		}

		if (num == res) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armStrong(407);
//		int num = 371;
//		int actNum=num;
//		double result=0;
//		
//		while(actNum!=0)
//		{
//			int base = actNum%10;
//			result  = result+Math.pow(base, 3);
//			actNum= actNum/10;
//		}
//		
//		if(result==num)
//		{
//			System.out.println("Given number " +num+ " is ArmStrong Number");
//		}
//		else {
//			System.out.println("Given number is not a ArmStrong Number");
//		}
//		
	}
}
