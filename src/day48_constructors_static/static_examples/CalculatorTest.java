package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3);
       //
        //
        // Calculator.multiply(2,3);
        Calculator calcObject = new Calculator();
        calcObject.multiply(2,4);

        // static method can also called using an object
        calcObject.add(4,5);
    }
}
