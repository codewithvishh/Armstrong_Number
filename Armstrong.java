import java.util.Scanner;
class Armstrong
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=sc.nextInt();
      double sum=0;
      int c=0,rem;
      int temp=n;
      int numCount=temp;
      while(numCount!=0)
        {
          numCount/=10;
          c++;
        }
      temp=n;
      while(temp!=0)
        {
          rem=temp%10;
          sum=sum+Math.pow(rem,c);
          temp/=10;
        }
      if(n==sum)
      {
        System.out.println("Armstrong Number");
        
      }
      else
      {
        System.out.println("Not Armstrong Number");
      }
    }
  }
