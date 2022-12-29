import java.util.*;
public class Bit_Manupulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        while(n>0)
        {
            int r = n%2;
            n = n/2;
            al.add(r);
        }
        sc.close();
        //Collections.reverse(al);
        System.out.println(al);
        
        int sum=0;
        
        for(int i=0 ; i<al.size();i++)
        {
            sum += al.get(i)* Math.pow(2 ,i);
        }
        System.out.println(sum);

        int  a =9;
        int b = 15;
        System.out.println(a&b);
    }
}