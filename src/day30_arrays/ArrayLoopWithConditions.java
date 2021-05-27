package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double [] prices ={22.9,12.4,43.12,65.0,100.4,543.23,98.32,533.43,34.23, 124.9, 234.23};
        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        for(double num:prices){
            if (num>100){
                System.out.println(num+" ");
            }

        }
        System.out.println("\n -----prices between 10 and 70 inclusive");
        for(double num1:prices) {
            if (num1 >= 10 && num1 <=70) {
                System.out.println(num1 + " ");
            }
        }
        int count =0;
        for (double price:prices){
            if (price>50){
                count++;
                System.out.println(count);
            }
        }
        System.out.println("--------------------");
        for (String country : countries){
            if (country.length()>=7) {
                System.out.println(country + "");
            }
        }
    }
}
