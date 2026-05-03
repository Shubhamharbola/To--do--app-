package dsa.Hashing;

public class frequencycounter {
    
    public int max(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
     return max; 
    }

     // precomputation
     public void countfrequency(int []arr){
        int max = max(arr);
     int []hash= new int[max+1];
     for(int j = 0 ; j< max +1; j++){
          hash[arr[j]]++  ;//   
     }

 for(int q=0; q<hash.length; q++){
     if (hash[q]>0) {
        System.out.println(q+""+"frequency"+""+hash[q] );
        
     }
    }

    }

    
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,1,5};
        frequencycounter f1 = new frequencycounter();
         f1.max(arr);
        f1.countfrequency(arr);
    }
}


