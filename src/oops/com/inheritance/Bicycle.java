package oops.com.inheritance;

public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue){
        this.gear = newValue;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void accelerate(int increment){
        speed += increment;
    }
}
