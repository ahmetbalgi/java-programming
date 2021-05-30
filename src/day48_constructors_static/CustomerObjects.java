package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {


        Customer cs1 = new Customer();
        System.out.println(cs1.toString());// print with default values that are  set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike",2); // creat object and assign values in same statement
        Customer cs3 = new Customer("Jhon Ward III", 3);
        System.out.println(cs2);
        System.out.println(cs3);
        // array of customers
        Customer[] todaysCustomers = {cs1, cs2,cs3, new Customer("Bashir ",449)};
        // arrayList of customers
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("suleyman", 9763));
        // print info of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);
        for(int i =0; i<customerList.size();i++){
            System.out.println(customerList.get(i));
        }
        for (Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);
        }
        // print only name of customer in the list
        System.out.println("---- name of customers");
        customerList.forEach(each -> System.out.println(each.getName()));

        for (Customer eachCustomer :customerList) {
            System.out.println(eachCustomer.getName());

        }




    }
}
