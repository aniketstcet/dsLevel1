package Level1;
import java.util.*;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int number=sc.nextInt();
        System.out.println("Enter K :");
        int k=sc.nextInt();
        
        int num=number;
        int count =0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
          k=k%count;
        
        if(k<0)
        {
          k=count+k;  
        }
        int j=count-k;
        num=number;
        int lastSection=(int)(num%((int)Math.pow(10,k)));
        lastSection*=(int)(Math.pow(10,j));
        int rotatedNum=lastSection + num/((int)Math.pow(10,k));
        
        System.out.println(rotatedNum);
        sc.close();
    }
    
}
