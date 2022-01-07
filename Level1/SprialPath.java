package Level1;

import java.util.Scanner;

public class SprialPath {

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
   
   int minc=0;
   int maxr=n-1;
   int maxc=m-1;
   int minr=0;
   while(true)
   {
   for(int i=minr;i<=maxr;i++)
   System.out.println(a[i][minc]);
   minc++;
   
   for(int i=minc;i<=maxc;i++)
   System.out.println(a[maxr][i]);
   maxr--;
   
   for(int i=maxr;i>=minr;i--)
   System.out.println(a[i][maxc]);
   maxc--;
   
  for(int i=maxc;i>=minc;i--)
   System.out.println(a[minr][i]);
   minr++;
   
   sc.close();
   }
   
   
 
   }
    
}
