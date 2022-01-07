
public class SortingAndAdding {

	public static void main(String[] args) {
		int a = 0;
        int b = 0;
        
        testDivideByZero(a);
        testDivideByNegative(a, b);
        testDivideByPositive(a, b);
	}
	
	public static  String testDivideByZero(double a){ 
		assert a / 0 == 0: "expected true condition";
	        return "Don't do that";
	}

	public static  String testDivideByNegative(double a,double b){
		assert a/(-1*b) == 0 : "expected true condition";
	        return "Don't do that";
	}

	public static String testDivideByPositive(double a,double b){ 
		assert a/b == 0 : "expected true condition";
	        return "Don't do that";
	}
	
	//int[][] matrix = new int[strArray.length][9];
}
