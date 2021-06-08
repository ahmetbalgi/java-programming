package day50_inheritance;

public class Student extends Person {
    //  IS-A

        String school;

        public void study(String topic) {
            System.out.println(name +" is studying "+topic +" at " + school);
        }

}
