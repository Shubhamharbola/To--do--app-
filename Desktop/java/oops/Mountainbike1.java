package oops;

 class Mountainbike1 implements Bicycle1 {
    private int seatheight;
    private int gear;
    private int speed;

    public Mountainbike1(int seatheight,int gear,int speed){
        this.seatheight = seatheight;
        this.gear= gear;
        this.speed= speed;

    }
    public void setGear(int gear) {
       this.gear = gear;
    }
    public int getgear(){
        return gear;
    }
    @Override
    public void applybreak(int decrement){
        speed= speed- decrement;
    }
    @Override
    public void speedup(int increment){
        speed = speed + increment;  
    }
    
}
