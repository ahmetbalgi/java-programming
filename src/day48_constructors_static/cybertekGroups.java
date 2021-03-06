package day48_constructors_static;

import java.util.Arrays;

public class cybertekGroups {
    public static void main(String[] args) {
        //dependency injection.group object creation depends on string name

        Group group1 = new Group("cyberbugs");
        //print size of numbers
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());


        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent","Andreea","Andrei"));
        System.out.println("group 2 members" +group2.getMembers());


        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group 2");
        }else {
            System.out.println("Akrem is not in group 2");
            group1.removeMember("Pavel");
            group1.removeMember("Elvin");
            System.out.println(group1);


        }
    }
}
