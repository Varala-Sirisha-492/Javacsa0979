import java.util.*;
class atm
{
public static void main(String[] args)
{
  int balance=0;
  Scanner sc = new Scanner(System.in);
  for( int i=0;i<=4;i++)
  {
  System.out.println("denomination:" );
  int d=sc.nextInt();
  System.out.println("enter the number of notes");
  int n=sc.nextInt();
  balance += d*n;
  }
  System.out.println("the balance is" +balance);
  }
  }


