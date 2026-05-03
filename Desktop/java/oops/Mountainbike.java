package oops;
public class Mountainbike extends bicycle {
    public int seatheight;

    public Mountainbike( int seatheight,int startgear,int startspeed){
        super(startgear, startspeed);
        this.seatheight=seatheight;

    }
    public void setseatheight(int newseatheigth){
        seatheight= newseatheigth;
    }

    }
    

