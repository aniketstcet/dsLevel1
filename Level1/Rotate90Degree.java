package Level1;
import java.util.Scanner;
public class Rotate90Degree {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      // int m=sc.nextInt();
      int[][] a=new int[n][n];
      for(int row=0; row<n;row++)
      {
          for(int col=0;col<n;col++)
          {
              a[row][col]=sc.nextInt();
          }
      }
      display(a); 
      
      
      for(int i=0;i<n;i++)
      {
          for(int j=i;j<n;j++)
          {
            
              int temp=a[i][j];
              a[i][j]=a[j][i];
              a[j][i]=temp;
          }
      }
     
      // int i=0; int k=n-1;
      // while (i<n && k>=0)
      // {
      //     for(int j=0; j<m;j++)
      //     {
      //         a[j][k]=a[i][j];
      //     }
          
      //     k++;
      //     i++;
      // }
       
         display(a); 
      }
  
      public static void display(int[][] arr){
          for(int i = 0; i < arr.length; i++){
              for(int j = 0; j < arr[0].length; j++){
                  System.out.print(arr[i][j] + " ");
              }
              System.out.println();
          }
      }
    
}
