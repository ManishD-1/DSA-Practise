public class BinerySearchPrac {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,6,7,10};
        int k = 4;
        int index = binerySearch(arr,k);
        System.out.println(index);
    }
    public static int binerySearch(int arr[],int k){
        int n =arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end)//if array contains only one element
        {
            int mid = (end+start)/2;
            if(arr[mid]>k)//first half of array
            {
                end = mid-1;
            }
            else if(arr[mid]<k)// second half of array
            {
                start = mid+1;
            }
            else{
                
                return mid;
               
            }
        }
        return -1;
    }
}
