package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<String> members = new ArrayList<>();
    //constructor that accepts a name
    public Group(String name){
        this.name=name;
        members = new ArrayList<>();

    }
    public void addMember(String newMember){
        members.add(newMember);
    }
    public void removeMember(String memberName){
        members.remove(memberName);
    }

    @Override
    public String toString() {
        return "Group{" +
                "namre='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public String getNamre() {
        return name;
    }

    public void setNamre(String namre) {
        this.name = namre;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
