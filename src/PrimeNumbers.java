
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int i = 0;
		String primeNumbers = "";
		
		for(i=1;i<=100;i++)
		{
			int count = 0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(primeNumbers+i+" ");
			}
		}
		
		
		
		
		
		
		
//		for (i = 1; i <= 100; i++) {
//			int count = 0;
//			for (num = i; num >= 1; num--) {
//				if (i % num == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				primeNumbers = primeNumbers + i+" \t";
//			}
//		}
//		System.out.println(primeNumbers);
//
	}

}
