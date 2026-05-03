package oops;
public class inheritancedemo {
    public static void main(String[] args) {
        
        Mountainbike firefox = new Mountainbike(3, 2, 1);
        System.out.println("ccurrent gear "+ firefox.gear);
        System.out.println("seat heigth"+ firefox.seatheight);
        // firefox.applybreak(1);
        // System.out.println("speed after braking " + firefox.speed);
        firefox.speedup(5);
        System.out.println("speed after accelration "+ firefox.speed);
    }
    
}
