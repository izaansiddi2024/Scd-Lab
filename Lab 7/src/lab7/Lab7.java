package lab7;

import java.util.ArrayList;
import java.util.List;

public class Lab7 {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 1000.00
        Account account = new Account(1000.00);

        // Define a dataset of transactions (type, amount)
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account, "deposit", 500.00));
        transactions.add(new Transaction(account, "withdraw", 300.00));
        transactions.add(new Transaction(account, "balance", 0));
        transactions.add(new Transaction(account, "withdraw", 200.00));
        transactions.add(new Transaction(account, "balance", 0));

        // Start and manage transaction threads dynamically
        List<Thread> threads = new ArrayList<>();
        for (Transaction t : transactions) {
            threads.add(t);
            t.start();
        }

        try {
            // Ensure that the main thread waits for all transaction threads to finish
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final balance after all transactions are processed
        System.out.println("Final Balance: " + account.getBalance());
    }
}
