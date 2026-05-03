package dsa.Hashing;

public class charfreq {
public void freq(String s){
    int hash[]= new int[26];
    for(int i = 0 ;  i < s.length();i++){
        hash[s.charAt(i)-'a']++;    // just typecast and using their int value to feed in hash array for indexing 
    }
  
for(int j= 0 ; j<hash.length; j++){
if(hash[j]>0){
    System.out.println("frequency of "+hash[j]);
}
}

}


    public static void main(String[] args) {
        charfreq cf = new charfreq();
       String s = "aabbcdclmqrtwsaflmm";
       cf.freq(s);
   
    }
    
}
