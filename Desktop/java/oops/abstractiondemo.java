package oops;

public class abstractiondemo {
    public static void main(String[] args) {
        graphic circle = new circle() ;
        circle.draw();
        circle.resize();
   
    graphic rectangle= new rectangle();
    rectangle.draw();
    rectangle.resize();

    // graphic g1 = new graphic(); contructor of abtract class canot be call explicitly can only called throgh child class
        
   
    }
}
