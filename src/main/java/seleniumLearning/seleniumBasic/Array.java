package seleniumLearning.seleniumBasic;

import org.junit.Test;

public class Array {
	
	public void arraycreation() {
		
		String car[]= new String[10];
		
		car[0]= "toyota";
		car[1]="Merce";
		car[2]="Nissan";
		car[3]="ford";
		car[4]="hyndai";
		car[5]="perzo";
		car[6]="bmw";
		car[7]="tesla";
		car[8]="xyz";
		car[9]="123";
		
		for(int i=0;i<=9;i++)
			
			
		System.out.println(car[i]+"\n");
		
		System.out.println("Length of the car array is:"+ car.length);
		
		
		
	}
@Test
	public void arraypractic() {
		
		//String rainbow[]= {brown,yellow,green,purple,white,black};
		
		String rainbow[]= {"red", "green","yellow","white"};
		
		for(int i=0;i<=3;i++)
		
		System.out.println(rainbow[i]+ "\n");
		
	
		
		
		int birds[]= {2,6,4,9,10,5};
		
		
		
		
		for(int i=0;i<=5;i++)
		
		System.out.println(birds[i]);
		
	}
	
	
	
}
