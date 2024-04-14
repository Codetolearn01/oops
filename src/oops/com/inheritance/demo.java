package oops.com.inheritance;

public class demo {
    public static void main(String[] args) {
        MountainBIke bajaj = new MountainBIke(20,1,40);
        System.out.println(bajaj.gear);
        System.out.println(bajaj.speed);
        System.out.println(bajaj.seatHeight);
        bajaj.applyBrake(15);
        System.out.println(bajaj.speed);
    }
}
