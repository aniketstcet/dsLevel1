package Level1;
import java.util.*;

public class AnyBaseSubtraction {
      
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter b");
    int b = scn.nextInt();
    System.out.println("Enter b");

    int n1 = scn.nextInt();
    System.out.println("Enter b");

    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
 }

 public static int getDifference(int b, int n1, int n2){
     int carry=0,precarry=0, sum =0, mul=1;
     if(n1<n2)
     {
         int temp =n1;
         n1=n2;
         n2=temp;
     }
     while(n1>0 || n2>0)
     {
         int a1=n1%10;
         int a2=n2%10;
         if(precarry==-1)
         {
             a1=a1+precarry;
         }
         
         if(a1<a2)
         {
             carry=b;
             precarry=-1;
         }
         else
         { carry=0;
            precarry=0;

         }
        

         int c = (carry+a1) -a2;
         sum+=c*mul;
         mul*=10;
         n1/=10;
         n2/=10;
     }
     return sum;
     
 }

    
}
