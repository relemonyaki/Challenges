import java.util.Arrays;

public class SingleStrings {

	public static void main(String[] args) {
		String line = "1,4,3,2,3,7,5,6,9"; 
		int temp;
		
		String[] strArray = line.split(",");
		
		System.out.print("Original set: \n");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + ", ");
		}
		System.out.println();
		
		int size = strArray.length;
	    int [] arr = new int [size];
	    
	    for(int i=0; i<size; i++) {
	         arr[i] = Integer.parseInt(strArray[i]);
	         for (int j = i; j > 0; j--) {
	 			if (arr[j] < arr [j - 1]) {
	 			      temp = arr[j];
	 			     arr[j] = arr[j - 1];
	 			    arr[j - 1] = temp;
	 			}
	 		 }
	      }
	    System.out.println();
	    System.out.print("Sorted in ascending order: \n");
	    for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + ", ");
		}
	    System.out.print("\n");
	    
	    for(int i=0; i<size; i++) {
	         arr[i] = Integer.parseInt(strArray[i]);
	         for (int j = i; j > 0; j--) {
	 			if (arr[j] > arr [j - 1]) {
	 			      temp = arr[j];
	 			     arr[j] = arr[j - 1];
	 			    arr[j - 1] = temp;
	 			}
	 		 }
	      }
	    System.out.println();
    	System.out.print("Sorted in descending order: \n");
	    for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + ", ");
		}
	}
}
