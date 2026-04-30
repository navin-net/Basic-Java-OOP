package navin.com.java.encapsulation;

public class Bank {

    private String bankName;

    private BankAccount[] bankAccounts;

    public Bank(String bankName, BankAccount[] bankAccounts) {
        super();
        this.bankName = bankName;
        this.bankAccounts = bankAccounts;
    }

    private BankAccount getBrankAccountByNumber(String accountNumber){
        for (BankAccount ba : bankAccounts){
            if (ba.getAccountNumber().equals(accountNumber)){
                return ba;
            }
        }
        return null;
    }

    private boolean isEnoughBalance(BankAccount bankAccount,double amount){
//        if (bankAccount.getBalance() >= amount) {
//            return true;
//        }
//        return false;
        return bankAccount.getBalance() >= amount;
    }

    private boolean isValidAmount(double amount){
        return amount > 0;
    }

    private void withdraw(BankAccount bankAccount, double amount){
        double balance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(balance);
    }

    private void deposit(BankAccount bankAccount, double amount){
        double balance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(balance);
    }

    public void transfer(String accountSource, String accountTarget, double amount){
        BankAccount source = getBrankAccountByNumber(accountSource);
        if (source == null){
            System.out.println("Invalid Source Account Number");
            return;
        }
        BankAccount traget = getBrankAccountByNumber(accountTarget);
        if (traget == null){
            System.out.println("Invalid Account Number");
            return;
        }
        boolean isValidBalance = isEnoughBalance(source, amount);
        if (!isValidBalance){
            System.out.println("Invalid isValidBalance");
            return;
        }
        if (!isValidAmount(amount)){
            System.out.println("amount isValidBalance");
            return;
        }

        withdraw(source,amount);
        deposit(traget,amount);
    }

    public void displayAccounts(){
        for (BankAccount bankAccount : bankAccounts){
            System.out.println(bankAccount.toString());
        }
    }









}
