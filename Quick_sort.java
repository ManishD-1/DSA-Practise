public class Quick_sort {
    public static void main(String[] args) {
        int arr[]={6,4,2,8,3};
        int n = arr.length;
        quickSort(arr,0,n-1);
       
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void quickSort(int arr[], int l, int r){
        if(l < r) {//we dont take l<=r condition.coz if l==r then it contains only one element. Which is already sorted.
            int pi = partition(arr, l, r);
             quickSort(arr, l, pi - 1);
             quickSort(arr, pi + 1, r);
        }
    }
    static int partition(int arr[], int l, int r){
        int i = l, j = r;
        while(i < j){
            while(i <= r && arr[i] <= arr[l]){
                i++;
            }
            while(arr[j] > arr[l]){ 
                j--;
            }
            if(i < j){
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
      
        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;
        return j;
    }

}
