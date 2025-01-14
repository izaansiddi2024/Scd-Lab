package Lab11;

//Driver class to simulate Bank operations
public class BankOperations {
 public static void main(String[] args) {
     // Create instances for each operation
     Bank billPayment = new BillPayment("Electricity Bill", 150.75);
     Bank openAccount = new OpenAccount("John Doe", "Savings");
     Bank loanApplication = new LoanApplication("Alice Brown", 50000.00);

     // Perform operations
     System.out.println("---- Performing Bank Operations ----");
     billPayment.performOperation();
     System.out.println();
     openAccount.performOperation();
     System.out.println();
     loanApplication.performOperation();
 }
}