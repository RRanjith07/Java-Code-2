package exceptionHandling;

public class ThrowsKeyword {
	public void sum() throws ArithmeticException
	{
		try{
			div();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public void div() throws ArithmeticException
	{
		int i=9/0;
	}

	public static void main(String[] args)throws ArithmeticException {
		ThrowsKeyword ob = new ThrowsKeyword();
		ob.sum();
	}

}
//Exception and Error are the child classes of the Throwable parent
