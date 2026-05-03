package dsa.recurssion;

public class infinite {
//     int count=0;
//   void count(){
//     System.out.println(count);
//     count++;
//  count();



// print name n times using resurssion 


// int cnt= 0;
//  void printname(){
//     if (cnt<5){
//     System.out.println("shubham"+cnt);
//         cnt++;
//     printname();
//     }
//  }

 // print n to 1

// public int  printname(int cnt){
//     if(cnt>0){
//         System.out.println("Shubham "+cnt);
        
//         printname(cnt-1);
//     }
//     return 0;
// }


// print 1 to n using backtracking

// void printname(int i , int n){
// if (i<1) {
//     return;}
//     printname(i-1, n);
//     System.out.println(i);
// }
 

// print n to 1 using backtracking

void printname(int i , int n){
if (i>4) {
    return;}
    printname(i+1, n);
    System.out.println(i);
}

    public static void main(String[] args) {
    //   infinite number = new infinite();
    //   number.count();


      infinite names = new infinite();
      names.printname(1,1);
    }
}
