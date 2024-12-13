import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class ExpandString {

	private static void expandString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				int count = Character.getNumericValue(s.charAt(i));
				for (int j = 1; j < count; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}
		}
	}
	private static void test(String str) {
		StringBuilder sb = new StringBuilder();
		int dollarCount = 1;
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch=='o') {
				sb.append("$".repeat(dollarCount));
				dollarCount++;
			}
			else {
				sb.append(ch);
			}
		}
	}

	public static void main(String[] args) {
		expandString("a2b3c1");
	}
}
