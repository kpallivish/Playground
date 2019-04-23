import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,x,y,z,s,j;
    Scanner sc = new Scanner (System.in);
        n= sc.nextInt();
    x= n % 10;
    y= n /100;
    z=n%100;
    s= z/10;
    j= x*100 + s *10 + y ;
    System.out.println(j);
  }
}