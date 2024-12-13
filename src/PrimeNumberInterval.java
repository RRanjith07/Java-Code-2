
public class PrimeNumberInterval {

	public static void main(String[] args) {
		
		//20 50
		int low = 20;
		int high = 80;
		
		
		while(low<high)
		{
			boolean isPrime = true;
			for(int i=2;i<low/2;i++)
			{
				if(low%i==0)
				{
					isPrime= false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(low);
			}
			low++;
		}
			

	}

}
