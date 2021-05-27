package replet;

import java.util.Arrays;

public class print {
    public static void main(String[] args) {

//
//    int i = 0;
//    while(i<10) {
//        System.out.println(i);
//        i += 3;

    //}
        char [] array={'d','a','c','d'};
        Arrays.sort(array);
        for (char each:array){
            System.out.println(each+" ");
            if (each=='d'){
                continue;
            }
        }
    }
}
