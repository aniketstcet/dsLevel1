package Level1;
import java.util.*;
public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
  int number=sc.nextInt();
  int count=0;
  int num=0;
  num=number;
  System.out.println("number is 1 "+ num);
  while(num!=0)
  {
    num/=10;
      count++;
  }
  System.out.println("Count :"+ count);
  num=number;
  System.out.println("number is 2 "+ num);
  int sum=0;
  while(num!=0)
  {
      int rem=num%10;
      sum=sum*10+rem;
      num/=10;
  }
   num=number;
   System.out.println("number is reverse "+ sum);
  sum=0;
  int i=1;
  while(i<=count)
  {
      int r=num%10;
      sum=sum+ i*(int)Math.pow(10,r-1);
      i++;
      num/=10;
      
      
  }
  
  System.out.println(sum);
  sc.close();
 
    }
    
    
    
}
