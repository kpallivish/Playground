/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		// Type your code here
    //  int mark;
      Scanner sc = new Scanner (System.in);
      int mark = sc.nextInt();
      if(mark>=85)
      {
      System.out.print("A");
      }
      else if (mark>=75 && mark<=85 )
      {
      System.out.print("B");
      }
      else if (mark >= 65 && mark <= 75  )
      {
      System.out.print("C");
      }
      else if (mark >= 55 && mark <= 65  )
      {
      System.out.print("D");
      }
      else if (mark >= 45 && mark <= 55  )
      {
      System.out.print("D");
      }else{
        System.out.print("Fail");
      }
   
    }
}