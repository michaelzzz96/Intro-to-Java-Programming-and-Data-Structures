import java.util.Date;
import java.util.ArrayList;


public class Problem_11_8 {

    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);

        // Set annual interest rate to 1.5%
        account.setAnnualInterestRate(1.5);

        // Deposit $30, $40, and $50 to the account
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        // withdraw $5, $4, and $2 from the account
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        // Print an account summary
        System.out.println("       Account Summary");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + account.getName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n     List of transactions");
        System.out.println("------------------------------------");
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.println("Date: " +
                    (account.getTransactions()).get(i).getDate());
            System.out.println("Type: " +
                    (account.getTransactions()).get(i).getType());
            System.out.println("Amount: " +
                    (account.getTransactions()).get(i).getAmount());
            System.out.println("Balance: " +
                    (account.getTransactions()).get(i).getBalance());
            System.out.println("Description: " +
                    (account.getTransactions()).get(i).getDescription());
            System.out.println();
        }
    }



        // Constructors

        private static class Transaction {
            // Data fields
            private java.util.Date date;
            private char type;
            private double amount;
            private double balance;
            private String description;

            // Constructors
            /** Construts a Transaction with specified
             * date, type, balance and description */
            public Transaction(char type, double amount,
                               double balance, String description) {
                date = new java.util.Date();
                this.type = type;
                this.amount = amount;
                this.balance = balance;
                this.description = description;
            }

            // Methods
            /** getDate */
            public String getDate() {
                return date.toString();
            }
            /** Set a new type */
            public void setType(char type) {
                this.type = type;
            }

            /** Return type */
            public char getType() {
                return type;
            }

            /** Set new amount */
            public void setAmount(double amount) {
                this.amount = amount;
            }

            /** Return amount */
            public double getAmount() {
                return amount;
            }

            /** Set a new balance */
            public void setBalance(double balance) {
                this.balance = balance;
            }

            /** Return balance */
            public double getBalance() {
                return balance;
            }

            /** Set a new description */
            public void setDescription(String description) {
                this.description = description;
            }

            /** Return description */
            public String getDescription() {
                return description;
            }
        }

        private static class Account {
            // Data fields
            private String name;
            private int id;
            private double balance;
            private static double annualInterestRate;
            private Date dateCreated;
            private ArrayList<Transaction> transactions;

            // Constructors
            /** Creates a default account */
            Account() {
                name = "";
                id = 0;
                balance = 0;
                annualInterestRate = 0;
                dateCreated = new Date();
                transactions = new ArrayList<Transaction>();
            }

            /** Creates an account with the specified id and initial balance */
            Account(int id, double balance) {
                name = "";
                this.id = id;
                this.balance = balance;
                dateCreated = new Date();
                transactions = new ArrayList<Transaction>();
            }

            /** Creates an account with the specified
             * name,id and initial balance */
            Account(String name, int id, double balance) {
                this(id, balance);
                this.name = name;
            }

            // Mutator methods
            /** Set new name */
            public void setName(String name) {
                this.name = name;
            }

            /** Return name */
            public String getName() {
                return name;
            }
            /** Set id */
            public void setId(int id) {
                this.id = id;
            }

            /** Set balance */
            public void setBalance(double balance) {
                this.balance = balance;
            }

            /** Set annualInterestRate */
            public void setAnnualInterestRate(double annualInterestRate) {
                this.annualInterestRate = annualInterestRate;
            }

            // Accessor methods
            /** Return id */
            public int getId() {
                return id;
            }

            /** Return balance */
            public double getBalance() {
                return balance;
            }

            /** Return annualInterestRate */
            public double getAnnualInterestRate() {
                return annualInterestRate;
            }

            /** Return dateCreated */
            public String getDateCreated() {
                return dateCreated.toString();
            }

            /** Return monthly interest rate */
            public double getMonthlyInterestRate() {
                return annualInterestRate / 12;
            }

            // Methods
            /** Return monthly interest */
            public double getMonthlyInterest() {
                return balance * (getMonthlyInterestRate() / 100);
            }

            /** Decrease balance by amount */
            public void withdraw(double amount) {
                balance -= amount;
                transactions.add(new Transaction('W', amount, balance,
                        "Withdrawal from account"));
            }

            /** Increase balance by amount */
            public void deposit(double amount) {
                balance += amount;
                transactions.add(new Transaction('D', amount, balance,
                        "Deposit to account"));
            }

            /** Return transactions */
            public ArrayList<Transaction> getTransactions() {
                return transactions;
            }
        }

}


