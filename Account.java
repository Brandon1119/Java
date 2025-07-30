//blueprint class
public class Account {
	private double balance;
	
	
	public Account(double initialBalance) {
		balance = initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void credit(double amount) {
		balance = balance + amount; 
	}
	
	public void debit(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Debit amount exceeded account balance");
		}
	}
	
	public String toString() {
		return String.format("balance %.2f", balance);
	}

}
