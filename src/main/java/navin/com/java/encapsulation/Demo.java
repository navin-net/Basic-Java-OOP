package navin.com.java.encapsulation;

public class Demo {
    public static void main(String[] args) {

        BankAccount[] bankAccounts = {
                new BankAccount("001", "Dara", 100),
                new BankAccount("002", "Sokha", 250),
                new BankAccount("003", "Vanna", 500)
        };

        Bank bank = new Bank("ABA",bankAccounts);
        bank.displayAccounts();
        System.out.println("-------------------");
        bank.transfer("001","002",50);
        bank.displayAccounts();
    }
}
