public class MyClass {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
	System.out.println(myNumbers[i][0]);
	System.out.println("");
      	
 	for(int j = 0; j < myNumbers[i].length; ++j) {
        	System.out.println(myNumbers[i][j]);
      	}
    }
  }
}



