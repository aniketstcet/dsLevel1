package Level1;
import java.util.Scanner;
public class RingRotateMatrix {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int m=sc.nextInt();
         
         //took array input
        int[][] a=new int[n][m];
        for(int row=0; row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                a[row][col]=sc.nextInt();
            }
        }
       
        
        //define varibale 
         int top=0;
        int bottom=n-1;
        int left=0;
        int right =m-1;
       
        
        //get ring number and no of rotation
        int s=sc.nextInt();
        int r=sc.nextInt();
        
        //go to ring number in the matrix
         top+=(s-1);
         bottom-=(s-1);
         left+=(s-1);
         right-=(s-1);
         
         int lengthOfRing=((bottom-top-1)+(right-left+1))*2;
         
         //handle large and negative rotation
         if(r<0)
         r=lengthOfRing + r;
         
         r=r%lengthOfRing;
         
         int[] b=new int[lengthOfRing];
         
         int k=0;
         //go to ring number and copy that particular ring numbers in an array
         
        for(int j = left; j <= right; j++){
                   b[k++]=a[top][j];
                }
          for(int i = top+1; i <=bottom-1; i++){
             b[k++]=a[i][right]; 
          }
           for(int j = right; j >= left; j--){
                   b[k++]=a[bottom][j];
                }
          for(int i = bottom-1; i >=top+1; i--){
             b[k++]=a[i][left]; 
          }
          
          rotate(b,lengthOfRing-r);
          
          k=0;
         //push back rotateed array into matrix at ring no s
           for(int j = left; j <= right; j++){
                   a[top][j]=b[k++];
                }
          for(int i = top+1; i <=bottom-1; i++){
             a[i][right]=b[k++]; 
          }
           for(int j = right; j >= left; j--){
                   a[bottom][j]=b[k++];
                }
          for(int i = bottom-1; i >=top+1; i--){
             a[i][left]=b[k++]; 
          }
          
         
         
         display(a);
         
        }
     //====================================================================
    
    //function to rotate an array
        public static void rotate(int[] a, int k){
        int n=a.length;
        k=k%n;
        
        if(k<0){
            k=k+n;
        }
       
        int p=0;
        int[] c=new int[k];
        
        //store the last digits of the array in anothe arry
        for(int i=n-k; i<n;i++)
        {
            c[p]=a[i];
            p++;
            
        }
        
        
        int j=n-k-1;
        
        for(int i=n-1;i>=k;i--)
        {
            a[i]=a[j];
            j--;
        }
        
      
        for(int m=0;m<k;m++)
        {
            a[m]=c[m];
        }
        
    
}

public static void display(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

}