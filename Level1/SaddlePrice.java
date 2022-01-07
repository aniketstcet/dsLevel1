package Level1;
import java.util.Scanner;
public class SaddlePrice {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        //int m=sc.nextInt();
        boolean flag=true;;
        //took array input
       int[][] a=new int[n][n];
       for(int row=0; row<n;row++)
       {
           for(int col=0;col<n;col++)
           {
               a[row][col]=sc.nextInt();
           }
       }
      
      int lc=0;
      int i=0;
      for(;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              if(a[i][lc]>a[i][j])
              {
                  lc=j;
              }
          }
          
          flag=true;
          for(int k=0;k<n;k++)
          {
              if(a[k][lc]>a[i][lc])
              {  flag=false;
                  break;
              }
          }
          
          
          
      }
      if(flag==true)
      {i--;
       
          System.out.println(a[i][lc]);
      }
      else
      System.out.println("Invalid input");
      
   }
    
}
