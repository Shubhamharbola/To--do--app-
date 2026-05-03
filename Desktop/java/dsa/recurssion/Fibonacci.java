package dsa.recurssion;

public class Fibonacci {
    public int fibonacci(int n ){
       if(n<=1){
        return n;
       }
      
      fibonacci(n-1);
      return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        System.out.println(f1.fibonacci(5));
    }
    
}
