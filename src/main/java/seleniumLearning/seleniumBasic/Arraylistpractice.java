package seleniumLearning.seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Arraylistpractice {
	
	
	@Test
	public void arraylistss() {
		
		
		//Creating Arraylist to store unlimited iteams
		
		List <String> country = new ArrayList<String>();
		
		//Adding iteams to the array list
		
		country.add(0, "India");
		country.add(1, "Australia");
		country.add(2, "Japan");
		country.add(3, "China");
		country.add(4, "Malaysia");
		country.add(5, "USA");
		country.add(6, "UK");
		
		int myListSize= country.size();
		
	//	Integer list = new Integer(list);
		
	//	System.out.println(myListSize + "\n");
		
		for(int i=0;i<=myListSize-1;i++)
		{
		
		System.out.println(country.get(i)+"\n");
	//	System.out.println(list.get(i));
		}
	
	

		ArrayList cloths = new ArrayList ();
		
		cloths.add(1);
		cloths.add("Jeans");
		cloths.add("T-shirt");
		cloths.add(4);
		cloths.add("Jacket");
		cloths.add(5);
		cloths.add(6);
		
		
		for (Object clothslist:cloths)
		{
			System.out.println("Cloths List  "+ clothslist);
		}
}
}