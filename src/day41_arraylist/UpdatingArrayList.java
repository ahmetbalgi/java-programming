package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        System.out.print(myCars.toString());// print all cars

        String allCarsIn1St = myCars.toString();// saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);
        // change index 0 to  lamborghini
        myCars.set(0, "lamborghini");

        System.out.println("after set = " + myCars.toString());

        //chang 4 to honda
        myCars.set(4, "honda");
        System.out.println("after set honda = " + myCars.toString());
        /**
         * how would you do that if mycars was array?
         * myCars[4] = "honda";
         *
         */
        System.out.println(myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);
        // change moskvich to jiguli
        myCars.set(moskvichIndex,"jiguli");
        System.out.println("after set to jiguli " + myCars);

        myCars.set(myCars.indexOf("ford"),"trabant");

        System.out.println("after set to trabant " + myCars);

        if (myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
            System.out.println("after set to bugatti " + myCars);
        }else {
            System.out.println("not found");
        }


    }
}
