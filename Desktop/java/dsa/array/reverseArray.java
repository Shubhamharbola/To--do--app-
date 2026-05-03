package dsa.array;

public class reverseArray {
    public void reverse(int[]nums){
        int start =0;
        int end = nums.length;
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
             
        start++;
        end--;
        }
       

    }
    
}
