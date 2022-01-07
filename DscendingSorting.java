
public class DscendingSorting {

	public static void main(String[] args) {
		int[] myArray = {1,23,67,133,2,7,9,45,109,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,225,27,28,29,30,31,32,38,33,34,35,36,237,0,39,40,41,42,43,44,45,46,47,48,49,50};
		int index = 0;
		for(int i = 0; i < myArray.length;i++) {
			System.out.print(myArray[i] + " ");
		}

		System.out.print("\n");
		myArray[19] += 60;
		myArray[21] += 61;
		int temp;
		for(int i = 0; i < myArray.length;i++) {
			for (int j = i; j > 0; j--) {
				if (myArray[j] > myArray [j - 1]) {
				      temp = myArray[j];
				      myArray[j] = myArray[j - 1];
				      myArray[j - 1] = temp;
				}
			 }
		}
		for (int i = 0; i < myArray.length; i++) {
			 System.out.print(myArray[i] + " ");
		}
	}
}
