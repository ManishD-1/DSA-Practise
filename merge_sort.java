public class merge_sort {
    public static void main(String[] args) {
        int arr[] = { 8, 6, 2, 1, 3 };
        int n = arr.length;
        int si = 0;
        int li = n - 1;
        devide(arr, si, li);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void devide(int arr[], int si, int li) {
        if (si< li) {
            
        
        int mid = (si + li) / 2;
        devide(arr, si, mid);
        devide(arr, mid + 1, li);
        conquor(arr, si, mid, li);
        }
    }

    public static void conquor(int arr[], int si, int mid, int li) {
        int merge[] = new int[li - si + 1];
        int x = 0;
        int idx1 = si;
        int idx2 = mid + 1;
        while ((idx1 <= mid) && (idx2 <= li)) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1];
                idx1++;
                
            } else {
                merge[x] = arr[idx2];
                idx2++;
                
            }
            x++;
        }
        while (idx1 <= mid) {
            merge[x] = arr[idx1];
            idx1++;
            x++;
        }
        while (idx2 <= li) {
            merge[x] = arr[idx2];
            idx2++;
            x++;
        }
        for (int i = si ; i <= li; i++) {
            arr[i] = merge[i-si];
        }

    }

}
