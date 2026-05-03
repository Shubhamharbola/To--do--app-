package oops;

public  abstract class graphic {
    int x,y;
graphic(){
    System.out.println("constructor of base class");
}
    void moveto(int newX, int newY){
        System.out.println("move x to "+ x+"and y"+ y);


    }
abstract void draw();
abstract void resize();

    
}
