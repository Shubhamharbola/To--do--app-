package dsa.array;

public class largest {

    public int largestElement(int[] nums) {

 int max = nums[0];
 for(int i = 0; i<nums.length;i++){
    if(nums[i]>max){
        max=nums[i];
    }

 }  return max;                                
    }


    // if directly want to pass the array is varargs
    //   public int largestElement(int ... nums)

    public static void main(String[] args) {
        largest arr = new largest();
        int[] nums ={1,24,56,37};
       System.out.println( arr.largestElement(nums));
    }
}
