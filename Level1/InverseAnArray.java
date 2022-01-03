package Level1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class InverseAnArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }
    
      public static int[] inverse(int[] a){
        int count =1,temp;
        int n=a.length;
        int i=0;
        while(count<= n)
        {
           int x=a[i];
           temp = a[x];
           a[x]=i;
           i=x;
            count++;
            System.out.print(a[temp]+" ");
        }
        return a;
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        int[] inv = inverse(a);
        display(inv);
     }
    
}
