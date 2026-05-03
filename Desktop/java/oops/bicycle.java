package oops;
public class bicycle {
    protected int gear;
    protected int speed;

    public bicycle(int startgear, int startspeed){
        gear = startgear;
        speed = startspeed;

    }

    public void setgear(int gearvalue){
        gear= gearvalue;
    }
    public void applybreak(int decrement){
        speed-= decrement;
    }
    public void speedup(int increment){
        speed += increment;
    }
    }
  
