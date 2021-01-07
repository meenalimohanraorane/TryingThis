/**
 * Display String in reverse order word by word
 * @author meenali
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friends";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		//System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String [] tokens = input.split(" ");
		for(int i=tokens.length-1;i>=0;i--)
		{
			System.out.print(" "+tokens[i]);
		}
		return null;
	}

}


