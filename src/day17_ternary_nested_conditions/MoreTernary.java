package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 55) ? "accept" : "reject";
        System.out.println(reply);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "murodil" : "nadir";
        System.out.println(teacher);

        boolean isEligibleToDrive =true;
        String driving =(isEligibleToDrive == true)? "have DL, Can drive" : "no DL, can't drive";
    }
}
