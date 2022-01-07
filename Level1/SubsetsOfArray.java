package Level1;

import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) throws Exception {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] bin=new int[n];
        
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        while(count< Math.pow(2,n))
        {
            
            getBinary(count, bin);
            
            printSubset(arr,bin);
            
            count++;
            System.out.println();
            
        }
    }
        
        public static void getBinary(int count, int[] bin)
        {
            int n=bin.length;
            int i=n-1;
            while(count>0)
            {
                bin[i]=count%2;
                count=count/2;
                i--;
                
            }
            
            
            
        }
        public static void printSubset(int[] arr, int[] bin)
        {
            int i=arr.length-1;
            while(i>=0)
            {
                if(bin[i]==0)
                System.out.print(" ");
                else
                System.out.print(arr[i]);
                i--;
            }

           
        }
     
    
    
}
