import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int n,x,y,z;
      Scanner sc = new Scanner (System.in);
      n = sc.nextInt();
      x = n/100;
      y= n % 10;
      
        
        z= (x + y);
      System.out.println(z);
	}
}