package Lab11;

//Bank interface (ADT) defining basic operations
interface Bank {
 void performOperation();
}

//Concrete Class for Bill Payment
class BillPayment implements Bank {
 private String billType;
 private double amount;

 // Constructor to initialize BillPayment
 public BillPayment(String billType, double amount) {
     this.billType = billType;
     this.amount = amount;
 }

 @Override
 public void performOperation() {
     System.out.println("Processing bill payment...");
     System.out.println("Bill Type: " + billType);
     System.out.println("Amount: " + amount);
     System.out.println("Bill payment completed successfully!");
 }
}

//Concrete Class for Opening an Account
class OpenAccount implements Bank {
 private String accountHolderName;
 private String accountType;

 // Constructor to initialize OpenAccount
 public OpenAccount(String accountHolderName, String accountType) {
     this.accountHolderName = accountHolderName;
     this.accountType = accountType;
 }

 @Override
 public void performOperation() {
     System.out.println("Opening a new account...");
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Account Type: " + accountType);
     System.out.println("Account opened successfully!");
 }
}

//Concrete Class for Loan Application
class LoanApplication implements Bank {
 private String applicantName;
 private double loanAmount;

 // Constructor to initialize LoanApplication
 public LoanApplication(String applicantName, double loanAmount) {
     this.applicantName = applicantName;
     this.loanAmount = loanAmount;
 }

 @Override
 public void performOperation() {
     System.out.println("Processing loan application...");
     System.out.println("Applicant Name: " + applicantName);
     System.out.println("Loan Amount: " + loanAmount);
     System.out.println("Loan application submitted successfully!");
 }
}