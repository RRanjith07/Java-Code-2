package exceptionHandling;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		System.out.println("Hai");
		
		try {
			throw new Exception("Ranjith Exception");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			
		System.out.println("Hey");
		
	}

}
