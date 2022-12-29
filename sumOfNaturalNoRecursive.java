public class sumOfNaturalNoRecursive {
    public static void main(String[] args) {
       int n = 5;
       int sum=0;
       System.out.println(add(n,sum));
       
    }
    
    public static int add(int n,int sum){
        
        System.out.println(n);
        if(n==1||n==0){
            return 1;
        }
         sum = n* add(n-1,sum);
       return sum;

    }
}
