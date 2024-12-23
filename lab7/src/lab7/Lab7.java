package lab7;

public class Lab7 {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 1000.00
        Account account = new Account(1000.00);

        // Create multiple transaction threads for deposit, withdrawal, and balance inquiry
        Transaction t1 = new Transaction(account, "deposit", 500.00);
        Transaction t2 = new Transaction(account, "withdraw", 300.00);
        Transaction t3 = new Transaction(account, "balance", 0);
        Transaction t4 = new Transaction(account, "withdraw", 200.00);
        Transaction t5 = new Transaction(account, "balance", 0);

        // Start the threads (transactions)
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            // Ensure that the main thread waits for all transaction threads to finish
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final balance after all transactions are processed
        System.out.println("Final Balance: " + account.getBalance());
    }
}
