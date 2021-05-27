package day41_arraylist;
import java.util.*;
public class Cities {
    public static void main(String[] args) {
       ArrayList<String> cities = new ArrayList<>();
       cities.add("washington DC");
       cities.add("new York");
       cities.add("Vienna");
       cities.add("Adana");
       cities.add("LA");
       cities.add(0,"Ashgabat");
        System.out.println(cities);
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(cities.size()-1));
        System.out.println("count of cities = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        for (int i = 0; i < cities.size(); i++) {//if you want to print only half of list
          //for (int i = 0; i < cities.size()/2; i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();


            for (String city:cities){
                System.out.print(city + " ");
            }
        System.out.println();

            // delet  item from arraylist
           //remove using index
           cities.remove(3);
            //remove using object
            cities.remove("new York");
        System.out.println("after remove = " + cities);

    }
}
