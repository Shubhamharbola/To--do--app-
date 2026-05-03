package random;

public class reverse {
    
    
    public static int rev1(int n){
        int rev = 0;
        while ( n!=0) {
            int lastdigit=n%10;
            rev = rev*10 + lastdigit;
            n = n/10;

        }
        return rev;
    }
    public static void main(String[] args) {

           
        
         
        System.out.println(" reversed number is "+rev1(35) );

    }
    
}
