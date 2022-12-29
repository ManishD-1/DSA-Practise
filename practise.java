public class practise {
    public static void main(String[] args) {
        int arr[] = {3,2,6,9,7,4};
        int n = arr.length;
        int l = 0;
        int r = n-1;
       //Quicksort(arr,0,n-1);
       //insertion_sort(arr);
       //Selection_Sort(arr);
       merge(arr,l,r);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Quicksort(int arr[],int low, int high)
    {
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            Quicksort(arr,low, pivot-1);
            Quicksort(arr,pivot+1, high);
        }
    }
    public static int partition(int arr[],int l ,int h)
    {
        int i = l;
        int j = h;
        while(i<j)//when i will become greater than j then we need to swap pivot and j (line no.41)
        {
            while(arr[i]<=arr[l])//arr[l] is a pivot..we want numbers smaller than pivot
            {
               i++;
            }
            while(arr[j]>arr[l])//here we want numbers greater than pivot
            {
                j--;
            }
            if(i<j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            // when i becomes greater than j then we got our pivot index i.e. at j
        }
        int temp = arr[j];
        arr[j]=arr[l];
        arr[l]= temp;
        return j;// important ..return pivot index

    }
    public static void insertion_sort(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            int index=i;
            while(index>0 && arr[index-1]>arr[index])
            {
                int temp =arr[index];
                arr[index] = arr[index-1];
                arr[index-1]=temp;
                index--;
            }
        }
    }
    public static void Selection_Sort(int arr[]){
        int n =arr.length;
        for(int i =0;i<n-1;i++)
        {
            int smallest =i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            
            }
            int temp =arr[smallest];
            arr[smallest] =arr[i];
            arr[i] =temp;
        }
    }
    public static void merge(int arr[],int l,int r){
         
        
        if(l<r)
        {
            int mid = (l+r)/2;
            merge(arr,l,mid);
            merge(arr, mid+1, r);
            conquor(arr,l,mid,r);
        }
    }
    public static void conquor(int arr[],int l , int mid, int r){
        int merge[] = new int[r-l+1];
        int x=0;
        int i1 = l;
        int i2 = mid+1;
        while((i1<=mid) && (i2<=r))
        {
            if(arr[i1]<=arr[i2])
            {
                merge[x] = arr[i1];
                x++;
                i1++;
            }
            else{
                merge[x] = arr[i2];
                i2++;
                x++;
            }
          
        }
        while(i1<=mid)
        {
            merge[x] = arr[i1];
            x++;
            i1++;
        }
        while(i2<=r)
        {
            merge[x]  = arr[i2];
            x++;
            i2++;
        }
        for(int i= l ; i<=r;i++)
        {
            arr[i] = merge[i-l];
        }
    }
}
