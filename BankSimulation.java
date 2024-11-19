class JointAccount {
    private int balance = 50000;

    // Synchronized method to handle withdrawal
    public synchronized void withdraw(String accountHolder, int amount) {
        System.out.println(accountHolder + " is trying to withdraw " + amount);
        if (amount <= balance) {
            System.out.println(accountHolder + " is withdrawing...");
            balance -= amount;
            System.out.println(accountHolder + " successfully withdrew " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println(accountHolder + " failed to withdraw. Insufficient balance!");
        }
    }
}

class AccountHolder extends Thread {
    private JointAccount account;
    private String name;
    private int withdrawalAmount;

    public AccountHolder(JointAccount account, String name, int withdrawalAmount) {
        this.account = account;
        this.name = name;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        account.withdraw(name, withdrawalAmount);
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        JointAccount jointAccount = new JointAccount();

        // Two account holders trying to withdraw money
        AccountHolder userA = new AccountHolder(jointAccount, "User A", 45000);
        AccountHolder userB = new AccountHolder(jointAccount, "User B", 20000);

        // Start both threads
        userA.start();
        userB.start();
    }
}
