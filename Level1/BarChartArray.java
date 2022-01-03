package Level1;
import java.util.Scanner;
public class BarChartArray {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
          int[] arr=new int[n];
          
          
           for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
          
          int max=Integer.MIN_VALUE;
          for(int i=0;i<n;i++)
          {
              if(max<arr[i])
              {
                  max=arr[i];
              }
          }
          
          while(max>0)
          {
              for(int i=0;i<n;i++)
               {
              
                   if(arr[i]==max)
                      {
                       System.out.print("*\t");
                       arr[i]--;
                       }
                   else
                       System.out.print("\t");
               }
               System.out.println("");
             
             max--;
          }
          
          
           
          
          
    }
}
