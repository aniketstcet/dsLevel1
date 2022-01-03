package Level1;
import java.util.*;

public class BarChart {
    
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
       if(max<a[i])
       {
           max=a[i];
       }
    }
    
   while(max>0)
   {
       for(int i=0;i<n;i++)
       {
           if(a[i]==max)
           {
               System.out.print("*\t");
               a[i]--;
           }
           else
           System.out.println("\t");
       }
       System.out.println();
       max--;
   }
 }
    
}
