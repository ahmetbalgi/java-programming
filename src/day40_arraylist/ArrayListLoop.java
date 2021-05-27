package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        nums.add(34);nums.add(44);nums.add(3); nums.add(88); nums.add(500);
        nums.add(5); nums.add(845);nums.add(0);
        System.out.println("nums = " + nums);
        nums.remove(0);
        //nums.remove(88); -> IndexOutOfBoundsException
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);

        // for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }
        // for each loop, and print all in same line
        for (int each:nums) {
            System.out.print(each +" ");

        }

    }
}
