package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(12757578);
        acc.setBalance(4545.2);
        acc.setAccountHolder("ahmet");
        acc.setType("360 Checking");

    }
}
