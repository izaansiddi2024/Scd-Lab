package lab7;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to ensure thread safety when depositing money
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Synchronized method to ensure thread safety when withdrawing money
    public synchronized boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance for withdrawal of: " + amount);
            return false;
        }
    }

    // Synchronized method to ensure thread safety when getting the balance
    public synchronized double getBalance() {
        return balance;
    }
}
