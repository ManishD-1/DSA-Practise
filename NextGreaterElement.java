import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        Stack <Integer> st =new Stack<>();
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int arr[] = new int[nums1.length];
        int l = 0;
       
        for(int i=0;i<nums1.length-1;i++)
        {
            for(int j=0;j<nums1.length-1-i;j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                    int temp=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=temp;
                }
            }
        }
     
     
        for(int i=0;i<nums1.length/2;i++)
        {
            int tmp = nums1[i];
            nums1[i] = nums1[nums1.length-1-i];
            nums1[nums1.length-1-i] = tmp;
        }
      
        for(int i=0;i<nums1.length;i++)
        {
            st.push(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            if(!st.empty() && nums2[i]==st.peek())
            {
                if(i==nums2.length-1)
                {
                    arr[l] = -1;
                    st.pop();
                }
                else{
                    if(nums2[i]<nums2[i+1]){
                        arr[l] = nums2[i+1];
                        l++;
                        
                    }
                    else{
                        arr[l] = -1;
                        l++;
                    }
                        st.pop();      
               }
                
            }
        }
    
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
