package random;
import java.util.Arrays;

public class Passinginfunction {
    
    public static void main(String[] args) {
        int[] num ={1,3,4,5,6};
        System.out.println(Arrays.toString(num)); 
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] num){
        num[0] = 10;

    }
}
