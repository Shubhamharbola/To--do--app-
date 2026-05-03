package dsa.recurssion;

public class Pallindrome {
    public boolean pallindrome(String s, int i ){
        if(i>=s.length()/2){
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
            
        }
        return pallindrome(s, i+1);
    }

    public static void main(String[] args) {
        Pallindrome p1 = new Pallindrome();
        System.out.println(p1.pallindrome("shubham", 0));
    }
    
}
