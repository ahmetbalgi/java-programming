package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName ="CYBERTEK";
        String password = "Abc123";
        if(userName.equalsIgnoreCase(expUserName)&& password.equals(expPassword)){
            System.out.println("Pass user successfully logged in"+ Instant.now());
        }else {
          if(!userName.equalsIgnoreCase(expUserName)){
              System.out.println("The user name is problem");
          }else {
              System.out.println("fail password is incorrect");
          }
        }
    }
}
