package inheritance_polymorphism.account;

public class SavingsAccount extends Account {
double interest;
	public SavingsAccount(long accountNo,String holderName,double account_balance,double interest) {
		super(accountNo,holderName,account_balance);
		this.interest=interest;
		Bank.addAccountNumber(this);
	}
	public void addInterest() {
		account_balance=account_balance+(account_balance*interest)/36500;
		System.out.println("Dear"+holderName+" "+(account_balance*interest)/36500+" Interest added today :)"+" Current Balance : "+account_balance);
	}

}
