package day13_conditional_stattements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("******* Welcom to TD Bank ATM *******");


        int secretPincode = src.nextInt();
        int inputPincode = 1234;
        if(secretPincode == inputPincode){
            System.out.println("welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        }else {
            System.out.println("Incorrect pincode! 1234");
            System.out.println("try again");
        }
    }
}
