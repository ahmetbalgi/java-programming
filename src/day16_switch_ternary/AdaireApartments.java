package day16_switch_ternary;

public class AdaireApartments {

    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        int numberOfBedroom = 1;
        double startingPrice = 0;
        switch (numberOfBedroom) {
            case 0:
                System.out.println("studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("one bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("studio apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedroom apartment currently unavailable");

                break;

        }
        System.out.println("starting price: " + startingPrice);
    }
}
