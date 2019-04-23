import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int x,y,z,s;
      Scanner sc = new Scanner (System.in);
      x= sc.nextInt();
      y=x/10;
      z=x%10;
      s = y+z;
      System.out.println(s);
	}
}