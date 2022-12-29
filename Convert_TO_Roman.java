import java.util.ArrayList;
import java.util.Scanner;
// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000
public class Convert_TO_Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ArrayList<String> al = new ArrayList<>();
        while(n>0)
        {
            if(n>=1000)
            {
                al.add("M");
                n = n-1000;
                
            }
            else if (n>=900 && n<1000)
            {
                al.add("CM");
                n = n-900;
                
            }
            else if (n>=500 && n<900)
            {
                al.add("D");
                n = n-500;
                
            }
            else if (n>=400 && n<500)
            {
                al.add("CD");
                n = n-400;
                
            }
            else if (n>=100 && n<400)
            {
                al.add("C");
                n = n-100;
                
            }
            else if (n>=90 && n<100)
            {
                al.add("XC");
                n = n-90;
                
            } 
             else if (n>=50 && n<90)
            {
                al.add("L");
                n = n-50;
                
            }
            else if (n>=40 && n<50)
            {
                al.add("XL");
                n = n-40;
                
            }
            else if (n>=10 && n<40)
            {
                al.add("X");
                n = n-10;
                
            }
            else if (n>=9 && n<10)
            {
                al.add("IX");
                n = n-9;
                
            }
            else if (n>=5 && n<9)
            {
                al.add("V");
                n = n-5;
                
            }
            else if (n>=4 && n<5)
            {
                al.add("IV");
                n = n-4;
                
            }
            else if (n>=1 && n<4)
            {
                al.add("I");
                n = n-1;
            }
            
        }
        for(String c : al)
        {
            System.out.print(c);
        }
    }
}
