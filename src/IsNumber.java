
public class IsNumber {
	public static boolean isNumber(String number)
	{
		try {
		Long.parseLong(number);
		System.out.println("valid number: "+ number);
		
		}
		catch(Exception e)
		{
			System.out.println("Not a valid number: "+ number);
			return false;
		}
		return true;
	}
	public static boolean isValidPhoneNumber(String number)
	{
		if(number.length()==10 && isNumber(number)) {
			System.out.println("Valid Phone Number "+number);
			return true;
		}
		else {
			System.out.println("Not a Valid Phone Number "+number);
			return false;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValidPhoneNumber("9449944729");
		

	}

}
