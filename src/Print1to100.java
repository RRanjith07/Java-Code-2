import java.util.BitSet;

public class Print1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set,1,set.length());

	}

}
