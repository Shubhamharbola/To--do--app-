package dsa;

public class bubbleSort {
    public  void bubblesort(int []arr){
        for(int j = 0;j<arr.length;j++){
            for(int i = 0; i<arr.length-j-1; i++){
                if(arr[i]> arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int []arr = {13, 24,46, 20,52,9};
        bubbleSort b1 = new bubbleSort();
        b1.bubblesort(arr);
for(int i = 0; i<arr.length;i++){
    System.out.println(arr[i] + ",");
}
    }
    
}
