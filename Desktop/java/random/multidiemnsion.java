package random;


import java.util.Scanner;
public class multidiemnsion {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
System.out.println("ENter the no of rows");
int rows = in.nextInt();
System.out.println("ENter the no of columns");
int columns = in.nextInt();

int[][]arr2d=new int[rows][columns];
// input for rows
for(int i=0;i<rows;i++){
    // for jagggerd array
    //for(int j= 0; j< arr[row].length){
    //       }
    for(int j=0;j<columns;j++){
        System.out.println("Enter the element at position ["+i+"]["+j+"]");
        arr2d[i][j]=in.nextInt();
   }
   System.out.println("");
  }
 }
}
































        // int[][] arr2d = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {7, 8, 9}
        // };
        // System.out.println(arr2d[2]);
      //  arr2d[2] refers to an array (not an element).
// Since arr2d[2] is an array reference, printing it will not print the actual numbers, but rather something like:
// System.out.println(Arrays.toString(arr2d[2]));


    
