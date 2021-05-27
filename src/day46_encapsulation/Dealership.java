package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Nissan Altima");
        car1.setYear(2020);
        car1.setMileages(1000);
        System.out.println("car1 model = "+ car1.getModel());
        System.out.println("car1 year = " + car1.getYear());
        System.out.println("car1 miles = " + car1.getMileages());

        System.out.println(car1.toString());
        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileages(16000);


        System.out.println("alfa romeo model = "+ alfaRomeo.getModel());
        System.out.println("alfa romeo  year = " + alfaRomeo.getYear());
        System.out.println("alfa romeo miles = " + alfaRomeo.getMileages());

        System.out.println(alfaRomeo);



    }
}
