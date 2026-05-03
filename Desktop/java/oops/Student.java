package oops;
public  class Student {
    // properties of class
    String name ;
    int age;  
    String add;  

    // contructor
//     Why do we need a constructor?

// To initialize objects automatically.

// To avoid repetitive code (otherwise, you’d need to manually set fields every time).

// To ensure an object starts in a valid state.
public Student(String n , int a, String add){
    name= n;
    age = a;
    this.add= add;// this is used when properties and contructor arguement variable name is exactly same to differntiate
}

public String getname(){
    return name;}
    public void  setname(String name){
       this.name = name;

    }
public int getage(){
   return age;}

   public void  setage(int age){
        this.age = age;

    }
public String getadd(){
    return add;}

    public void  setadress(String add){
       this.add= add;

    }
public static void main(String[] args){
        Student s1 = new Student("shubham", 21, "gamma 1");
        System.out.println(s1.getname());   
 Student s2 = new Student("Raimaa", 21, "kota");
 System.out.println(s2.getadd());
 System.out.println(s2.getname());
 System.out.println(s2.getage());


    }

}