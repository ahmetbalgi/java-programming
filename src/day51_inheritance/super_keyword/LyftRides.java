package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRides = new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        Lux luxRide = new Lux();
        System.out.println("lyftRide for 5 miles = $ " + lyftRides.calculateRate(5));
        System.out.println("lyftLXRide for 5 miles = $ " + lyftXLRide.calculateRate(5));
        System.out.println("luxRide for 5 miles = $ " + luxRide.calculateRate(5));
    }
}
