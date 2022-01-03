package Level1;
import java.util.*;
public class gcdLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int c=1;
        while(c>0)
        {
            c=num2%num1;
            if(c==0)
            {
                break;
            }
            num2=num1;
            num1=c;
        }
        System.out.println(num1);
        sc.close();
    }
    
}
