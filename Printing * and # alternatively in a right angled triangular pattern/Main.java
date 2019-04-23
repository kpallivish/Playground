import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int i,n,j;
      Scanner sc = new Scanner (System.in);
      n = sc.nextInt();
      int x = 1;
      for ( i =1 ; i <= n ; i++)
      {
        for ( j=1;j<=i;j++)
        {
          if ( x == 1)
          {
       System.out.print("*");   
            x =0;
          }else {
            System.out.print("#");
            x = 1;
          }
          
          }
        System.out.print("\n"); 
      }// Type your code here
	}
}