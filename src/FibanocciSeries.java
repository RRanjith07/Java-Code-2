
public class FibanocciSeries {
	public static void main(String[] args) {
		
		long t1 = 0;
		long t2 = 1;
		int count = 20;
		long sum = 0;
		
		for(int i=0;i<count;i++)
		{
			System.out.println(t1);
			sum = t1+t2;
			t1=t2;
			t2=sum;
		}
		
	}

}
