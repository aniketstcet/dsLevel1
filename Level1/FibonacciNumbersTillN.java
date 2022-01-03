package Level1;
import java.util.*;

public class FibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int a=0, b=1;

        int c=0;
        if(count>=1)
        System.out.println(a);
        if(count>=2)
        System.out.println(b);
        for(int i=1;i<=count-2;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
        sc.close();
    }
    
}
