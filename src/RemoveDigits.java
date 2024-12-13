
public class RemoveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remDigit("Ranjith123"));

	}
	
	public static String remDigit(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				res= res+str.charAt(i);
			}
		}
		return res;
		
		
		
	}

}
