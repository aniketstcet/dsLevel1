package Level1;

import java.util.*;

public class AnyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int mul=1,sum=0;
     while(n2>0)
     {
         int a=n2%10;
         int s=getProductTemp(b,n1,a);
         s=s*mul;
         sum=getSumAnybase(b,sum,s);
         mul=mul*10;
         n2=n2/10;
     }
     return sum;
 }
 
 
 public static int getProductTemp(int b, int n1, int a2)
 {
    int mul=1,sum=0,carry=0;
    while(n1>0)
    {
       int  a1=n1%10;
        int c= a2*a1 + carry;
        if(c>=b)
        {
            carry=c/b;
            c=c%b;
            
        }
        else
        carry=0;
        
        sum=sum + c*mul;
        mul*=10;
        
        n1/=10;
    }
    if(carry>0)
    {
        sum=sum+carry*mul;
    }
    return sum;
 }
 
  public static int getSumAnybase(int b, int n1, int n2){
       int carry=0, sum=0, mul=1;
       while(n1>0 || n2>0)
       {
           int a1= n1%10;
           int b1=n2%10;
           int c=a1+b1+carry;
           if(c>=b)
           {
               //carry=c-(b-1);
               carry=1;
               c=c-b;
           }
           else
           carry=0;
           
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