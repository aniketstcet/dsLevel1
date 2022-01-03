package Level1;
import java.util.*;

public class AllPrimesTillN{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter low number");
        
        int low=sc.nextInt();
        System.out.println("Enter high number");
        int high=sc.nextInt();
     
        for(int i=low;i<=high;i++)
        {    boolean flag=false;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                flag=true;
               break;}
            }
            if(flag==false)
             System.out.println(i);
        }
        sc.close();
    }
}