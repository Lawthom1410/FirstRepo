package rev;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "esiotrot";
		String output = "";
		char[] cs = input.toCharArray();
		
		System.out.println(cs);
		for (int i = cs.length-1; i>= 0; i--) {
			output += cs[i];
		}
		System.out.println(output);
	}
}