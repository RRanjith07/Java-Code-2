import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'A');
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i =1;i<=num;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			else if(i%3==0 )
			{
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
