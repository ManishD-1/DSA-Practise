import java.util.*;
public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int paths = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j] && ((i+1)*(j+1))%k == 0){
                    paths++;
                }
            }
        }
        System.out.println(paths);
    }
}
