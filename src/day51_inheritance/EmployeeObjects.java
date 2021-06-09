package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle= "Java developer";
        System.out.println(developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55);
        System.out.println("annualDevSalary = " + annualDevSalary);


        Contractor sdetContractor = new Contractor();
sdetContractor.jobTitle = "SDET";
        double sedtSalary = sdetContractor.calculateSalary(53);
        System.out.println("sedt salary " + sdetContractor.calculateSalary(55));

        System.out.println(developer);
        System.out.println(sdetContractor);


    }
}
