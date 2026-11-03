package id.ac.polinema;

public class BusinessAccount extends Account {
    private double monthlyTransactionFee;

    public BusinessAccount(String accountNumber, Customer owner, double balance, double monthlyTransactionFee) {
        super(accountNumber, owner, balance);
        this.monthlyTransactionFee = monthlyTransactionFee;
    }

    public double getMonthlyTransactionFee() {
        return monthlyTransactionFee;
    }

    public void printAccountType() {
        System.out.println("Account type: Business, monthly fee: " + monthlyTransactionFee);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount > 0 && getBalance() - amount >= 1000000;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        printAccountType();
    }
}
