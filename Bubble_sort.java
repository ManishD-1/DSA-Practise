import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            int arr[]=new int [n];
            
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            
        }
        
    }
    
}
