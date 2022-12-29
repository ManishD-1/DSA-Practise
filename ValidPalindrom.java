import java.util.*;
public class ValidPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
      System.out.println(isValidPalindrom(s));
    }
    public static boolean isValidPalindrom(String s){
        ArrayList<Character> list = new ArrayList<>();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                list.add(s.charAt(i));
            }
        }
        //System.out.println(list);
        int n =list.size();
        int j= n-1;
        if(list.size()==0)
            return true;
        for(int i=0;i<n/2;i++)
        {
            if(list.get(i)==list.get(j))
            {
                j--;
                continue;
            }
            else
              return false;

        }
        return true;
        
    }
}
