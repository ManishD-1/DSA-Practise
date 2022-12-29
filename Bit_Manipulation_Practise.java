import java.util.*;
public class Bit_Manipulation_Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        sc.close();
        System.out.println(FindSetBits(n));
        // if(isEven(n))
        //   System.out.println("EVEN");
        // else
        //   System.out.println("ODD");   
     
        //System.out.println(EXCEPTIONALLY_Odd(arr, n));
    }
    public static int EXCEPTIONALLY_Odd(int [] arr , int n){
        int sum = 0;
        for(int i=0;i<n;i++)
        {
           sum = sum^arr[i];
        }
        return sum;
    }
    public static boolean isEven(int n){
        int m = n&1;
         if(m==0)
           return true;
         else
           return false;  
    }
    public static int FindSetBits(int n){
      int count = 0;
      while(n>0)
      {
        int m = n&1;
        if(m!=0)
        {
          count++;
        }
        n>>=1;
      }
      return count;
    }
    public static int CountSetBits(int n){
      int count = 0;
      while(n>0)
      {
        n = n&(n-1);// It will unset least significant digit
        count++;
      }
      return count;
    }
}
