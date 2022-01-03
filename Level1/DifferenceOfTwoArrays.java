package Level1;
import java.util.*;
public class DifferenceOfTwoArrays {
    public static void main(String[] args) throws Exception {
    
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n;
        int[] temp;
        
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
         n=n1;
        if(n1<n2 || (n1==n2&&(a[0]<b[0])))
        {
            temp=a;
            a=b;
            b=temp;
            n=n2;
        }
        
        int[] c=new int[n];
        int precarry=0;
        int i=a.length-1;
        int j=b.length-1;
        
        while(i>=0 && j>=0)
        {
            a[i]=a[i]+precarry;
            if(a[i]<b[j])
            {
                a[i]=a[i]+10;
                precarry=-1;
                
            }
            else
            precarry=0;
            
            c[i]=a[i]-b[j];
            System.out.println("c[" + "]" + c[i]);
            i--;
            j--;
            
        }
        
        while(i>j && i>=0)
        {
            c[i]=a[i]+precarry;
            System.out.println("c[" + "]" + c[i]);
            i--;
        }
        
        
        while(j>i && j>=0)
        {
            c[j]=b[j]+ precarry;
            System.out.println("c[" + "]" + c[i]);
            j--;
        }
        
        if(precarry<0)
        {
            c[0]=c[0]+precarry;
            System.out.println(c[0]);
        }
        
        for(int k=0;k<n;k++)
        {
        System.out.println(c[k]);
        }
        
     }
    
}
