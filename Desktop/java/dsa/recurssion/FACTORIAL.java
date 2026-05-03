package dsa.recurssion;

public class FACTORIAL {
    public int factorial(int n ){
        if(n<=1){
            return 1;
        }
       return n*factorial(n-1);     
      
    }
   
    public static void main(String[] args) {
        FACTORIAL f1 = new FACTORIAL();
       System.out.println( f1.factorial(5));

    }
}
