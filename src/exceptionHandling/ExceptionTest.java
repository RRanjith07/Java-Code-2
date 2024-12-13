package exceptionHandling;

public class ExceptionTest {
	int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=9/0;
//		System.out.println(i);
//		Thread.sleep(2000);
		
//		ExceptionTest obj = new ExceptionTest();
//		obj=null;
//		System.out.println(obj.a);
		
		// 1. try catch block
		try {
			int i=9/0;
			System.out.println(i);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("This is exception");
			
		}
		System.out.println("End of the code");
	}

}//we can Report
