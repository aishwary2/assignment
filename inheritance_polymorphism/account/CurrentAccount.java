package inheritance_polymorphism.account;

public class CurrentAccount extends Account{
double overDraftLimit;
	public CurrentAccount(long accountNo,String holderName,double account_balance,double overDraftLimit) {
		super(accountNo,holderName,account_balance);
		this.overDraftLimit=overDraftLimit;
		Bank.addAccountNumber(this);
	}
	public double getOverDraftLimit() {return overDraftLimit;}
}
