import java.util.*;
public class X_ish_word {
    public static void main(String args[]) {
        try (// your code here
      Scanner sc = new Scanner (System.in)) {
        String str = sc.next();
        String X = sc.next();
        int sum =0; int sum2=0;
        for(int i=0;i<X.length();i++)
          {
            char z = X.charAt(i);
            if(str.contains(String.valueOf(z))){
              sum++;
            }
            else{
              sum2++;
            }
            
          }
        if(sum==X.length())
        {
          System.out.println("true");
        }
        else if(sum2>0){
          System.out.println("false");
        }
      }
      
    }
  }
  //----------Recursive approach----------//


  
    /*    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner (System.in);
      String str = sc.next();
      String X = sc.next();
       int sum=x_ish(str,X,0,0);
          if(sum==X.length())
       {
          System.out.println("true");
       }
          else {
         System.out.println("false");
       } 
      }
      public static int x_ish(String str,String X,int i,int sum){
        if(i==X.length()){
          return sum;
        }
        else{
          char z = X.charAt(i);
          if(str.contains(String.valueOf(z))){
             sum++;
            
          }
          
        }
      return  x_ish(str,X,i+1,sum);
       
      }
}*/
