package dsa.array;
import java.util.Arrays;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
                int[] arr =  new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 20;
        arr[3] = 20;
        arr[4] = 20;

        // input using loops
        for(int i = 0; i<arr.length; i++){

          arr[i]= in.nextInt(); 

        }


         System.out.println(Arrays.toString(arr));// best way to print
                // for each loop
        // for (int container : arr) {
        //     System.out.println(container + "");// container represent element of array
            
        // }
}


}
