public class quick_sort2 {
    public static void main(String[] args) {
        int arr[]={5,3,8,1,2};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int low ,int high){
        if(low<high)
        {
            int pidx = partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static int partition(int arr[],int low,int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j = low;j< high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high] = temp;
        return i;
    }
}
