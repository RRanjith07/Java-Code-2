
public class Exponent {

	public static void main(String[] args) {
		
		int exp = 0;
		int base =3;
		long result =1;
		
		while(exp!=0)	
		{
			result=result*base;
			--exp;
		}
		System.out.println(result);
	}

}
