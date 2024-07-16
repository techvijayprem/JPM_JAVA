package bank_exception;

public class bank {
	
	private String accName;
	private double balance;
	
	public bank(String accName, double balance) {
		 
		this.accName = accName;
		this.balance = balance;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "bank [accName=" + accName + ", balance=" + balance + "]";
	}
	
	public void withdraw(double amount) throws LowBalanceException {
        if (balance - amount < 1000) {
            throw new LowBalanceException("Insufficient balance. Balance cannot be less than 1000.");
        }
        balance -= amount;
    }
	
}
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank account = new Bank("John Doe", 2000);
        System.out.println(account.toString());

        try {
            account.withdraw(500);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
            account.withdraw(1500); // This will throw a LowBalanceException
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
