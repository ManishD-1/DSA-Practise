public class a {
    public static void main(String[] args) {
       int ind1 =-1;
       int ind2 =-1;
       int k = 5;
       int arr[] = {1,2,5,5,4,5,6};
       int n =arr.length;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==k){
               ind1 = i ;
               break;
           }
       }
       for(int i=n-1;i>=0;i--)
       {
           if(arr[i] == k)
           {
               ind2 = i;
               break;
           }
       }
       System.out.print(ind1 + " " + ind2+ " ");
    }
}
