public class MoveZeroes {
    public void moveZeroes(int []arr){
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = 1; j<arr.length;j++){
                if (arr[i]==0 && arr[j]!=0) {
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;

                    
                }
                if(arr[i]==0 && arr[j]==0){
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        MoveZeroes moveZero = new MoveZeroes();
        int arr[]= {0,1,0,3,12};
        

    moveZero.moveZeroes(arr);
    ystem.out.println(Arrays.toString(arr));
        
    }
    
}
