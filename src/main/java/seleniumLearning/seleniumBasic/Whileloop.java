package seleniumLearning.seleniumBasic;

import org.junit.Test;

public class Whileloop {
	
	@Test
	public void whilelooplearning(){
	
	int count = 40;
	while (count<80) {
	
	System.out.println("Value of S : "+ count);
	count++;
	}
	
}
	
	
	
	public void dowhileloop() {
		
		int l =20;
		
		do {
			System.out.println("Value of l : "+ l);
			l++;
		}while (l<=50);
		
	}
}
