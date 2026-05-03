package dsa.array;

public class SecondLargest {
public int SecondLargest(int[]arr){
    int largest = arr[0];
    int Slargest= -1;
    for(int i = 1 ; i<arr.length;i++){
    if(arr[i]>largest){
        Slargest = largest;
        largest= arr[i];
        
    }
    else if(arr[i]<largest && Slargest < arr[i] ){
        Slargest = arr[i];
        System.out.println(Slargest);
    }
    }
    return Slargest;}

    int SecondSmallest(int []arr){
        int smallest = arr[0];
        int ssmallest = 10^7;
     for (int i = 1; i<arr.length; i ++){
        if(smallest > arr[i]){
            ssmallest = smallest;
          smallest = arr[i];
        }
        else if ( ssmallest>arr[i]&& smallest<arr[i]){
            ssmallest = arr[i];

        }
     }
     return ssmallest;
    }


public static void main(String[] args) {

    SecondLargest slargest = new SecondLargest();
    
        int []arr = {1,2,4,7,7,5};
    System.out.println(slargest.SecondSmallest(arr));
}
}
