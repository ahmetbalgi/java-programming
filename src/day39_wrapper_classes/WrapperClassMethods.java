package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5,2));
        System.out.println("min int: "+ Integer.MIN_VALUE);
        System.out.println("max int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,23.9));

        System.out.println("min double: " + Double.MIN_VALUE);
        System.out.println("max double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,45));


        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isUpperCase('Q'));

        char letter ='A';
        if (Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word = "jaVa id FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }

        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE.equals(5>3));
    }
}
