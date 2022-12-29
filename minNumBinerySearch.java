class minNumBinerySearch {
    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};//Rotated sorted array
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int mid;
        while(l<=r){
            mid = (l+r)/2;
            if(arr[mid]>arr[r])
            {
                l = mid+1;
            }
            else if(arr[mid]<arr[r])
            {
                r =mid;
            }
            else{   //l==r
                System.out.println(arr[mid]);
                break;// break is for getting out oof loop
            }
        }

    }
}
