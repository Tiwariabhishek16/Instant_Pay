package RandomNumGen;

import java.util.Random;

public class RandomNumGen {

	public static void main(String[] args) {
		
		
		//Class Random
		
		Random rd = new Random(); //rd is an object
		
		int rdNum ;
		
		rdNum = rd.nextInt(10);
		
		System.out.println("Random number is : "+rdNum);

	}

}
