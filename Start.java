public class Start {
    public static void main(String[] args) {
        // Savings Account Setup
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("11111111");
        sa.setAccountHolderName("OOP1");
        sa.setBalance(10000);
        sa.setInterestRate(7.5);

        // Fixed Account Setup
        FixedAccount fa = new FixedAccount();
        fa.setAccountNumber("11111112");
        fa.setAccountHolderName("OOP1");
        fa.setBalance(100000);
        fa.setTenureYear(10);

        // Bank Setup
        Bank b = new Bank();
        b.setName("DBBL");
        b.setSavingsAccount(sa);
        b.setFixedAccount(fa);

        // Printing all details using get methods
        System.out.println("Bank Name: " + b.getName());
        System.out.println("---------------------------");
        
        System.out.println("Savings Account Details:");
        System.out.println("Number: " + b.getSavingsAccount().getAccountNumber());
        System.out.println("Holder: " + b.getSavingsAccount().getAccountHolderName());
        System.out.println("Balance: " + b.getSavingsAccount().getBalance());
        System.out.println("Interest Rate: " + b.getSavingsAccount().getInterestRate() + "%");
        
        System.out.println("---------------------------");
        
        System.out.println("Fixed Account Details:");
        System.out.println("Number: " + b.getFixedAccount().getAccountNumber());
        System.out.println("Holder: " + b.getFixedAccount().getAccountHolderName());
        System.out.println("Balance: " + b.getFixedAccount().getBalance());
        System.out.println("Tenure Year: " + b.getFixedAccount().getTenureYear());
    }
}