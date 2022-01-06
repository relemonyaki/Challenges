import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {
		String[] myArray = new String[101];
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz");
				myArray[i] = "Fizz";
			}
			else if(i % 3 == 0) {
				myArray[i] = "Buzz";
			}
			else if (i % 5 == 0) {
				myArray[i] = "FizzBuzz";
			}
			else {
				myArray[i] = Integer.toString(i);
			}
			System.out.print(myArray[i] + " ");
		}
	}
}
