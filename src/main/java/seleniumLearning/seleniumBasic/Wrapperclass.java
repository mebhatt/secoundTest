package seleniumLearning.seleniumBasic;

import org.junit.Test;

public class Wrapperclass {
@Test
	public static void main(String[] args) {
		
	//Converting String to Int
		String m = "100";
		int d = Integer.parseInt(m + 10);
		System.out.print(d+ "\n");
		
		
//Converting Integer to String.
		int i = 200;
		String s = String.valueOf(i);
		System.out.print(s);
	}

}
