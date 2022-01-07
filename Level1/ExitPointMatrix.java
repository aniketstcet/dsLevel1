package Level1;

import java.util.Scanner;

public class ExitPointMatrix {

    public static void main(String[] args) throws Exception {
        
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int[][] a=new int[n][m];
   for(int row=0; row<n;row++)
   {
       for(int col=0;col<m;col++)
       {
           a[row][col]=sc.nextInt();
       }
   }
   
   int dir=0;
   int i=0;
   int j=0;
   
   while(true)
   {
       if(dir==0 )
       {
           if(a[i][j]==1)  {
            dir++;
            i++;

           }         
               
            else
               j++;
           
       }
       
       if(dir==1 )
       {
           if(a[i][j]==1){
            dir++;
            j--;

           }
           
               
               else
               i++;
           
       }
       
       if(dir==2 )
       {
           if(a[i][j]==1){
            dir++;
            i--;

           }
           
              
               else
               j--;
           
       }
       
       if(dir==3 )
       {
           if(a[i][j]==1){
            dir++;
            j++;

           }
           
               
               else
               i--;
           
       }      
       
       
       dir=dir%4;  
       
       if(i==-1)
       {
           i++;
           break;
       }
       if(j==-1)
       {
           j++;
           break;
       }
       if(i==n)
       {
           i--;
           break;
       }
       if(j==m)
       {
           j--;
           break;
       }
       
       System.out.println(i);
       System.out.println(j);
   }

   System.out.println(i);
   System.out.println(j);
   }
    
}
