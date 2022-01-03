package Level1;
import java.util.Scanner;
public class InvertedBarChartArr {
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
          //int count=1;
            
          while(max>=1)
          {
              for(int i=0;i<n;i++)
               {
             
                   if(arr[i]>0)
                      {
                       System.out.print("*\t");
                       arr[i]--;
                        
                       }
                   else
                       System.out.print("\t");
               }
               System.out.println();
               
             
             max--;
             
          }
          
          
           
          
          
    }
}
