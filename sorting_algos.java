import java.util.Scanner;

public class sorting_algos {
    public static void main(String[] args) {
        TakingInput();
    }
    public static void TakingInput()
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int l = 0;
        int r = n-1;
        mergesort(arr , l ,r);
        printans(n, arr);
    }
    public static void printans(int n,int []ans)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] bubbleSort(int n , int arr[]){
        // Place largest element to rightmost of array
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }
    public static int[] insertionsort(int n , int arr[])
    {
        // Insert element from unsorted part to sorted part
        // Suppose array is 4 6 2 1 9 3
        //   sorted part | unsorted part
        //              4| 6 2 1 9 3
        //            4 6| 2 1 9 3
        //          2 4 6| 1 9 3
        //        1 2 4 6| 9 3
        //      1 2 4 6 9| 3
        //    1 2 4 6 9 3|
        for(int i=0;i<n;i++)
        {
            int index = i;
            while(index>0 && arr[index]<=arr[index-1])
            {
                int t= arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = t;
                index--;
            }
        }
        return arr;
    }
    public static int[] selectionsort(int n,int[]arr)
    {
        // Place smallest element to leftmost array
        // Suppose take array 4 6 2 1 9 3
        // we will find smallest element of array from index 0-n
        // Here it is 1, So we will swap it with 0th index ele and will increase our index
        // We will swap 4 with 1
        //   1 6 2 4 9 3
        //   1 2 6 4 9 3
        //   1 2 3 4 9 6
        //   1 2 3 4 6 9
        for(int i=0;i<n-1;i++)
        {
            int smallest = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest]>=arr[j])
                {
                    smallest = j;
                }
            }
            int t = arr[i];
            arr[i] =arr[smallest];
            arr[smallest] = t;
        }
        return arr;
    }
    public static void quicksort( int arr[],int l,int r)
    {
        // In this we have to find correct position for our pivot element
        // Here we take 1st elem as our pivot
        // After we find its postion we split array in two parts by pivot and find its pivot
        if(l<r)
        {
            int pi = partition(arr,l,r);
            quicksort(arr, l, pi-1);
            quicksort(arr, pi+1, r);
        }
    }
    public static int partition(int arr[] , int l , int r)
    {
        int i = l;
        int j = r;
        while(i<j)
        {
            while(i<=r && arr[i]<= arr[l])
            {
                i++;
            }
            while(arr[j]>arr[l])
            {
                j--;
            }
            if(i<j)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void mergesort(int[]arr,int l,int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int arr[] , int l , int mid, int r)
    {
        int x = 0;
        int merge[] = new int[r-l+1];
        int idx1 = l;
        int idx2 = mid+1;
        
        while(idx1<=mid && idx2<=r)
            {
                if(arr[idx1]<=arr[idx2])
                {
                    merge[x++] = arr[idx1++];
                    
                }
                else{
                    merge[x++] = arr[idx2++];
                    
                }
            }
        while(idx1<=mid)
            {
                merge[x++] = arr[idx1++];
            }
        while(idx2<=r)
            {
                merge[x++] = arr[idx2++];
            }
        for(int i=l;i<=r;i++)
        {
            arr[i] = merge[i-l];
        }

    }
}
