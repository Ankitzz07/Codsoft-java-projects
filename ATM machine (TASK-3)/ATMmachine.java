package confirmation;
import java.util.*;

class ATM{
	double balance;
	int pin;
	int actualpin=3479;
	//pre-defined atm pin in the code 
	public void checkpin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin to avail services :");
		int pin=sc.nextInt();
		
		if(pin == actualpin) {
			profiles();
		}else
			System.out.println("Invalid pin ! Try again.");	
		checkpin();
	}
	public void profiles() {
		System.out.println("Enter your choice :");
		System.out.println("Press 1 for checking balance");
		System.out.println("Press 2 for withdraw of money");
		System.out.println("Press 3 for deposit of money");
		System.out.println("Press 4 for exit");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		if(choice==1) {
			Balance();
		}else if(choice ==2) {
			withdraw();
		}else if(choice ==3) {
			deposit();
		}else if(choice==4) {
			exit();
		}else
			System.out.println("Invalid input !!");
	}
	public void Balance() {
		System.out.println("Balance :"+balance);
	}
	public void withdraw() {
		System.out.println("Enter amount to withdraw:");
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}else if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Money debited successfully!");
			System.out.println("Available balance: "+balance);
			System.out.println(" ");
		}
		profiles();
	}
		public void deposit() {
			
			System.out.println("Enter amount to deposit:");
			Scanner sc=new Scanner(System.in);
			double amount=sc.nextDouble();
			
			if(amount>0) {
				balance=balance+amount;
				System.out.println("Money credited successfully !");
				System.out.println("Available balance: "+balance);
				System.out.println(" ");
			}else {
				System.out.println("Invalid input !");
			}
			profiles();
		}
		public void exit() {
			System.out.println("Thank you for using the ATM machine. Hope to see you soon again !!");
			 return;
		}
}
public class ATMmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM obj=new ATM();
		
		obj.checkpin();
	}

}
