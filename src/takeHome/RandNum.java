package takeHome;
import java.util.Random;

public class RandNum {

		public static void main(String[] args) {
			
			Random ranNum = new Random();
			int count; 
			int[] numberArray = new int[500]; //Generating 500 numbers
			numberArray[0] = ranNum.nextInt(1000); //Initializing the first number
			//int largest = numberArray[0]; 
			int smallest = numberArray[0];
			
			System.out.println("Random Numbers: ");
			for (count = 1; count < 10; count++) {
				numberArray[count] = ranNum.nextInt(1000); //store numbers in array
//				largest = Math.max(largest, numberArray[count]); //compare with previous largest 
				smallest = Math.min(smallest, numberArray[count]); //compare with previous smallest
				
				System.out.println(numberArray[count]);
				
			}
			
			System.out.println("The smallest number is: " + smallest);
			
			

		}
		
		
}
