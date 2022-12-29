import java.util.*;

public class isSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        System.out.println(isSequence(s, t));
    }

    public static boolean isSequence(String s, String t) {
        int n = t.length();
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < s.length() && t.charAt(i) == s.charAt(j)) {
                j++;
                count++;
            }

        }
        if (count == s.length())
            return true;
        else
            return false;
    }
}
