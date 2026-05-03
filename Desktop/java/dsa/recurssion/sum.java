package dsa.recurssion;

public class sum {
    public int  sum(int Sum, int i){
    if(i<5){
        Sum = Sum + i;
         i++;
         return sum(Sum,i);  
 }
  return Sum;  } 

    public static void main(String[] args) {
        sum sumn = new sum();
       System.out.println(sumn.sum(0,0)); 
    }
    
}
