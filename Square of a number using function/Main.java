import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(square(n)); // Function call
	}
    // Function to find the sum of numbers
	public static int square(int y)
	{    
      int x = y*y;
	   
	    return x;
	}
} // End of Main class