package Level1;
import java.util.*;

public class AnyBaseToAnyBase {
    public static int getValueIndecimal(int n, int b){
        int mul=1, sum=0;
        while(n!=0)
        {
            int k=n%10;
            n=n/10;
            sum=sum+k*mul;
            mul=mul*b;
        }
        return sum;
     }
    
    
     public static int getValueInBase(int n, int b){
         int sum=0;
        int  mul=1;
        while(n!=0)
        {
            int k=n%b;
            n=n/b;
            sum=sum+k*mul;
            mul*=10;
        }
         return sum;
     }
     
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
       int  destBase= scn.nextInt();
       int decimalvalue=getValueIndecimal(n,sourceBase);
       int changedVlaue=getValueInBase(decimalvalue,destBase);
       System.out.print(changedVlaue);
       scn.close();
     }  
    
}
