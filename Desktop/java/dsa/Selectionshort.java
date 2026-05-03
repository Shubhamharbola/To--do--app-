package dsa;

import java.util.Arrays;

import oops.students;

public class Selectionshort {
    public int min ( int []arr){
        int min = arr[0];
        for ( int j = 0 ; j < arr.length; j++){
            if( arr[j]<min){
                min = arr[j];
                
            }
        }
        return min ;
    }

    public int swap(int []arr){
        int minValue = min(arr);
 for(int i = 0 ; i< arr.length-2; i++  )    {   
int temp = arr[i];
 arr[i]= minValue;
 minValue = temp;   }

return 


}
    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        Selectionshort s1 = new Selectionshort();
        s1.swap(arr);
    }
}
