package day17_ternary_nested_conditions;

import javax.sound.midi.Soundbank;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 10;
        String quality = "good";

        int x = (quality.equals("good")) ? 100 : 0;
        String result = (score > 60) ? "pass" : "fail";
        char grade = (score > 90) ? 'A' : 'B';
        String evenOdd = (score % 2 == 0) ? "even" : "odd";

        System.out.println(x);
        System.out.println(result);
        System.out.println(grade);
        System.out.println(evenOdd);

    }
}
