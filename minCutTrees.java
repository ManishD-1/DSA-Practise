import java.util.Scanner;
public class minCutTrees {
public static void main(String[] args) {
    try (Scanner sc = new Scanner (System.in)) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        minCutTree(arr, k);
    }
}
    public static void minCutTree(int[] arr, int k){
        int hmax = 0;
        for(int i=0;i<arr.length;i++){
          hmax = Math.max(hmax, arr[i]);
        }
    
        
        int lo = 0;
        int hi = hmax;
    
        while(lo<=hi){
          int mid = lo + (hi-lo)/2;
    
          int woodMid = 0;
          for(int i=0;i<arr.length;i++){
            woodMid += Math.max(0, arr[i]-mid);
          }
    
      
          int woodMidLessOne= 0;
          for(int i=0;i<arr.length;i++){
            woodMidLessOne += Math.max(0, arr[i]-mid+1);
          }
    
          if(woodMid<=k && woodMidLessOne<=k){
            hi = mid-1;
          }
          else if(woodMid<=k && woodMidLessOne>k){
            System.out.println(mid);
            return;
          }
          else if(woodMid>k){
            lo = mid+1;
          }
        }
      }
    

}
