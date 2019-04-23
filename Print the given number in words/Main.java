import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int option = in.nextInt();
  switch(option)
  {
   case 2:
    System.out.println("Two");
    break;
   case 3:
    System.out.println("Three");
    break;
   case 4:
    System.out.println("Four");
    break;
   default:
    System.out.println("Invalid");
  }
 }
}