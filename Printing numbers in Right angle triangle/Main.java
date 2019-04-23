import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int i,n,j;
      Scanner sc = new Scanner (System.in);
      n = sc.nextInt();
      for ( i =1 ; i <= n ; i++)
      {
        for ( j=1;j<=i;j++)
        {
       System.out.print(i);    
        }
        System.out.print("\n"); 
      }// Type your code here
	}
}