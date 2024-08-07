package Practice;


		// Custom exceptions
		class NegativeDepositException extends Exception {
		    public NegativeDepositException(String message) {
		        super(message);
		    }
		}

		class InsufficientFundsException extends Exception {
		    public InsufficientFundsException(String message) {
		        super(message);
		    }
		}

		// BankAccount class
		class BankAccount {
		    private double balance;

		    public BankAccount(double initialBalance) {
		        if (initialBalance < 0) {
		            this.balance = 0;
		        } else {
		            this.balance = initialBalance;
		        }
		    }

		    public double getBalance() {
		        return balance;
		    }

		    public void deposit(double amount) throws NegativeDepositException {
		        if (amount < 0) {
		            throw new NegativeDepositException("Cannot deposit a negative amount.");
		        }
		        balance += amount;
		    }

		    public void withdraw(double amount) throws InsufficientFundsException {
		        if (amount > balance) {
		            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
		        }
		        balance -= amount;
		    }
		}

		// Main class for testing
		public class BankingApp {
		    public static void main(String[] args) {
		        BankAccount account = new BankAccount(1000.0); // Initial balance is 1000.0

		        try {
		            System.out.println("Current Balance: " + account.getBalance());
		            account.deposit(500.0);
		            System.out.println("Balance after deposit: " + account.getBalance());
		            account.withdraw(200.0);
		            System.out.println("Balance after withdrawal: " + account.getBalance());
		            
		            // Testing negative deposit
		            account.deposit(-100.0);
		        } catch (NegativeDepositException | InsufficientFundsException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }

		        try {
		            // Testing insufficient funds
		            account.withdraw(1500.0);
		        } catch (InsufficientFundsException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		    }
		}

	


