package oops.com.inheritance;

class MountainBIke extends Bicycle{
    public int seatHeight ;

    public MountainBIke(int startHeight,
                        int startGear,
                        int startSpeed){
        super(startGear,startSpeed);
        this.seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        this.seatHeight = newValue;
    }
}
