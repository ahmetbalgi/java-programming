package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void seatInCar() {
        System.out.println("Open the door and set in driver seat");

    }

    public static void startTheCar() {
        System.out.println("Insert key to ignition and turn clockwise and Start the car");
    }

    public static void shiftToDrive() {
        System.out.println("Press brake pedal and shift to d");
    }

    public static void pressGasPedal() {
        System.out.println("Hold steering wheel with 2 hands and press das pedal");
    }
}
