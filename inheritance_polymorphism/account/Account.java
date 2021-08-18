package inheritance_polymorphism.account;

public  class Account {
long accountNo;
String holderName;
double account_balance;

public Account(long accountNo,String holderName,double account_balance) {
	this.accountNo=accountNo;
	this.holderName=holderName;
	this.account_balance=account_balance;
}
public void addInterest() {}

public double getAccountBalance() {
	return account_balance;			
}
public double getOverDraftLimit() {return 0.0;}
public void withdrowMoney(double money) {
	if(money>account_balance) {
System.out.println("Insufficient Balance");
}else {
	account_balance=account_balance-money;
System.out.println("Money has been Withdrown!! Your current account balance is "+account_balance);	
}
}
}
