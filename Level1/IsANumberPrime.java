package Level1;

import java.util.Scanner;

public class IsANumberPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a number "+"t" +"as input representing count of input numbers to be tested.");
        int t=sc.nextInt();
        int count=0;
        
        while(t>0)
        {
           System.out.println("Enter number to check if prime:");

            int n=sc.nextInt();
            
            for(int k=2;k*k<=n;k++)
            {
                if(n%k==0)
                {
                   count++;
                   break;
                   
                }
            }
            if(count==1)
             System.out.println("not prime");
             else
             System.out.println("prime");
            
            t--;
            
        }
    
        sc.close();          
    }
    
}
      
