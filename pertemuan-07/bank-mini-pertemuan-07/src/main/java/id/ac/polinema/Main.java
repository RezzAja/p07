package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Langkah 1: refactoring canWithdraw ===");
        Customer c1 = new Customer("Nadia", "0812-0000-0001");
        Account a1 = new Account("A001", c1, 500000);
        a1.withdraw(150000);
        Customer c2 = new Customer("Sari", "0812-0000-0002");
        Account a2 = new Account("A002", c2, 200000);
        Bank bank0 = new Bank(10);
        bank0.addAccount(a1);
        bank0.addAccount(a2);
        bank0.printAllAccounts();

        System.out.println();
        System.out.println("=== Langkah 2: override SavingsAccount ===");
        Customer c3 = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", c3, 100000, 0.02);
        System.out.println("Withdraw 70000 allowed? " + savings.canWithdraw(70000));
        savings.printInfo();

        System.out.println();
        System.out.println("=== Langkah 3: override CheckingAccount ===");
        Customer c4 = new Customer("Dewi", "0812-0000-0004");
        CheckingAccount checking = new CheckingAccount("A004", c4, 100000, 200000);
        System.out.println("Withdraw 250000 allowed? " + checking.canWithdraw(250000));
        checking.withdraw(250000);
        Bank bank = new Bank(10);
        bank.addAccount(savings);
        bank.addAccount(checking);
        bank.printAllAccounts();

        System.out.println();
        System.out.println("=== Langkah 4: overloading deposit ===");
        savings.deposit(50000, "Initial top-up");
        savings.printInfo();

        System.out.println();
        System.out.println("=== Tugas Mandiri 1: BusinessAccount ===");
        Customer c5 = new Customer("PT Maju Jaya", "0812-0000-0005");
        BusinessAccount business = new BusinessAccount("A005", c5, 2000000, 25000);
        System.out.println("Withdraw 1500000 allowed? " + business.withdraw(1500000));
        business.printInfo();
    }
}
