package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums={100, 5, 1, 7, 0, -4 ,44 ,33};


        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: "+nums[0]);
        System.out.println("max value: "+nums[nums.length-1]);
        String[] word ={"java","c#","c++","kotlin","python","ruby","Assembly"};
        System.out.println(Arrays.toString(word));
        System.out.println("["+String.join(",",word)+"]");
        Arrays.sort(word);
        Arrays.sort(word, Collections.reverseOrder());

        System.out.println(Arrays.toString(word));
    }
}
