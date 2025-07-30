//driver class
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		//create 2 acc objects
		Account account1 = new Account(50);
		Account account2 = new Account(8.93);
		
		Scanner input = new Scanner(System.in);
		double num;
		
		//display balance
		System.out.printf("account1 balance: %.2f\n", account1.getBalance());
		System.out.println("account2" + account2);// call toString method
		
		//ask for deposit amount
		System.out.print("Enter amount to be deposited for account1:$");
		num = input.nextDouble();
		account1.credit(num);
		
		System.out.print("Enter amount to be deposited for account2:$");
		num = input.nextDouble();
		account2.credit(num);
		
		//display balance
		System.out.printf("account1 balance %.2f\n" , account1.getBalance());
		System.out.println("account2" + account2);
		
		//ask for withdraw amount
		System.out.print("Enter amount to be withdrawn for account1:$");
		num = input.nextDouble();
		account1.debit(num);
		
		System.out.print("Enter amount to be withdrawn for account2:$");
		num = input.nextDouble();
		account2.debit(num);
		
		input.close();
		


	}

}
