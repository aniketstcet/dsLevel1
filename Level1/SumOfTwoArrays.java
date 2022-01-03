package Level1;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n;
       
       int[] a=new int[n1];
       for(int i=0;i<n1;i++)
       {
           a[i]=sc.nextInt();
       }
       
       int n2=sc.nextInt();
       
       int[] b=new int[n2];
       for(int i=0;i<n2;i++)
       {
           b[i]=sc.nextInt();
       }
       
       if(n1>n2)
       n=n1;
       else
       n=n2;
       
       int[] c=new int[n];
       int i=n1-1;
       int j=n2-1;
       int k;
       int carry=0;
       if(i>j)
       k=i;
       else
       k=j;
       
       
       while(i>=0 && j>=0)
       {
           c[k]=a[i]+b[j]+carry;
           if(c[k]>9)
           {
               c[k]=c[k]%10;
               carry=1;
           }
           else
           {
               carry=0;
           }
         i--;
         j--;
         k--;
           
       }
       while(i>j && i>=0)
       {
          c[k]=a[i]+carry ;
            if(c[k]>9)
           {
               c[k]=c[k]%10;
               carry=1;
           }
           else
           {
               carry=0;
           }
          i--;
          k--;
       }
       while(j>i && j>=0)
       {
            c[k]=b[j]+carry ;
            
              if(c[k]>9)
           { 
               c[k]=c[j]%10;
               carry=1;
           }
           else
           {
               carry=0;
           }
          j--;
          k--;
       }
      if(carry>1)
      {
          System.out.println(carry);
      }
       
        for(int y=0;y<n;y++)
       {
           System.out.println(c[y]);
       }
       
    }
    
}
