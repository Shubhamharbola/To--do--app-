package dsa.array;

public class CheckSort {
   public boolean SortedArray(int []arr){
        for(int i = 0 ; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }
             
        }
        return true;
    }
    public static void main(String[] args) {
        CheckSort sortedArray = new CheckSort();
        int [] arr= {1,2,2,3,3,4};
      System.out.println(  sortedArray.SortedArray(arr));
    }
    
}
