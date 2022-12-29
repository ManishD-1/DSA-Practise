import java.util.HashMap;



public class HM_Two_Sum {
    public static void main(String[] args) {
       
       int arr[] = {-2, 1 , 2 , 7 ,11 , 15};
       int k = 0;
       int ans[] = new int[2];
       ans=TwoSum(arr ,  k);
       for(int i=0;i<ans.length;i++)
       {
          System.out.println(ans[i]);
       }

    }
    public static int[] TwoSum(int[]arr , int k){
        HashMap <Integer , Integer> hm = new HashMap<>();
        int n = arr.length;
        //{ 1 , 2 , 7 ,11 , 15}
        int ans [] = new int[2];
        for(int i =0; i < n; i++)
        {
            if(hm.containsKey(k - arr[i]))
            {
                ans[0] = hm.get(k - arr[i]);
                ans[1] = i;
               return ans;
            }
            hm.put(arr[i],i);
        }
       return ans;
    }
}
