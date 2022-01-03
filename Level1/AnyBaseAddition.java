package Level1;
import java.util.*;
public class AnyBaseAddition {

public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter b ");
      int b = scn.nextInt();
      System.out.println("Enter n1 ");
      int n1 = scn.nextInt();
      System.out.println("Enter n2 ");
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
      scn.close();
   }
  
   public static int getSum(int b, int n1, int n2){
       int carry=0, sum=0, mul=1;
       while(n1>0 || n2>0)
       {
           int a1= n1%10;
           int b1=n2%10;
           int c=a1+b1+carry;
           if(c>=b)
           {
               carry=c-(b-1);
               c=c-b;
           }
           sum=sum+c*mul;
           mul=mul*10;
           n1=n1/10;
           n2=n2/10;
       }
       if(carry>=1)
       {
           sum=sum+carry*mul;
       }
       return sum;
   }
}
