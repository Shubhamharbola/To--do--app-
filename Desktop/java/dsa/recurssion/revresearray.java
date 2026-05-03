package dsa.recurssion;

public class revresearray {
    // public int reverse(int[]arr,int start,int end){
    //     if(start>=end){
    //         return 1;
    //     }
    //  int temp = arr[start];
    //  arr[start]= arr[end];
    //  arr[end]= temp;
    //  return reverse(arr, start+1, end-1);


    // }

// using only 1 pointer
public int reverse(int start,int[]arr){
    if(start>=arr.length/2){
        return 0;

    }
    int temp = arr[start];
    arr [start]= arr[arr.length-start-1];
arr[arr.length-start-1] = temp;
return reverse(start+1, arr);

}

    public static void main(String[] args) {
        revresearray arr1 = new revresearray();
        int[]arr={2,3,4,5,6,7};
        System.out.println(arr1.reverse( 0,arr));
        // print revrese array
         for (int n : arr) {
            System.out.print(n + " ");
        }
    }
    
}
