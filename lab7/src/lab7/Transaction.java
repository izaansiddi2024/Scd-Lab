package lab7;

public class Transaction extends Thread {
    private Account account;
    private String type;
    private double amount;

    public Transaction(Account account, String type, double amount) {
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public void run() {
        switch (type) {
            case "deposit":
                account.deposit(amount);
                break;
            case "withdraw":
                account.withdraw(amount);
                break;
            case "balance":
                System.out.println("Balance Inquiry: " + account.getBalance());
                break;
            default:
                System.out.println("Invalid transaction type: ");
                
        }
    }
}