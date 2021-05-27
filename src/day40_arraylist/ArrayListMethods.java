package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList= new ArrayList<>();
        System.out.println("size = "+ shoppingList);
        System.out.println(shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("list is empty, keep coding java");
        }else {
            System.out.println("list is not empty, code java then go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        if (shoppingList.isEmpty()){
            System.out.println("list is empty, keep coding java");
        }else {
            System.out.println("list is not empty, code java then go to mall");
        }
        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);
        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else {
            System.out.println("shoes is not in the list");
        }
        System.out.println("buying shoes ....$80");
        shoppingList.remove("shoes");
        System.out.println(shoppingList);
        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();
        System.out.println(shoppingList);
    }

}
