package dsa.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
    // public void freq(int arr[]){
    //     Map<Integer,Integer> freq1 = new HashMap<>();
    //     for(int i = 0 ; i <arr.length; i++){
    //         int count = freq1.getOrDefault(arr[i],0);// if the value of key is present then get value of if not treat 0
    //         freq1.put(arr[i],count +1);
    //     }
        // for character 
  public void freq(String s){
        Map<Character,Integer> freq1 = new HashMap<>();
        for(int i = 0 ; i <s.length(); i++){
            int count = freq1.getOrDefault(s.charAt(i),0);// if the value of key is present then get value of if not treat 0
            freq1.put(s.charAt(i),count +1);
        }

        
// fetch 
        for(Map.Entry<Character, Integer> e:freq1.entrySet()){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        hashmap h1 = new hashmap();
       String s = "aabbsbdhfasfb";

        h1.freq(s);
    }
    
}
