
public class binery_search {

    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};
       int n=arr.length;
       int element =4 ;
       int low = 0;
       int high = n-1;
       
       while(low<=high){
        int mid = (low+high)/2;
           if(arr[mid]==element)
           {
               System.out.println(mid);
           }
           if(arr[mid]<element)
           {
               low=mid+1;
           }
           else{
               high = mid-1;
           }
       }
     
    }
}