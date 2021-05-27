package day30_arrays;

public class SttudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0]="AD1234";
        student1[1]= "Adam";
        student1[2] = "Smith";
        student1[3]= "B22";
        student1[4]= "202-543-1234";

        String[] student2 ={"MK4421","Mike","Bloomberg","B22","703-432-1234"};
        System.out.println("student1 id = "+student1[0]);
        System.out.println("student1 firstname = "+student1[1]);
        System.out.println("student1 lastname = "+student1[2]);
        System.out.println("student1 num= "+student1[3]);
        System.out.println("student1 mobile num = "+student1[4]);
        System.out.println("student1 data length= "+student1.length);
        if (student1.length == 5){
            System.out.println("data array has correct length = "+student1.length);
        }else {
            System.out.println("data array has incorrect length");
        }
        if (student1.length==student2.length){
            System.out.println("Pass: data array length match");
        }else {
            System.out.println("Fail: data array not match");
        }
        System.out.println(student1[1].toUpperCase()+ " "+student1[2].toUpperCase());

    }
}
