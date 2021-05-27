package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title ="JAVA SDET";
        String company = "Palo Alto Network";
        String jobDescription = "Java, Selenium, Cucumber,JUnit";
        double salary = 123000;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job description: " + jobDescription);
        System.out.println("Salary: " + salary);
        System.out.println("Years of experience" + yearsOfExp);
        System.out.println("Has benefits? " + hasBenefits);
    }
}
