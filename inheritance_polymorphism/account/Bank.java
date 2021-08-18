package inheritance_polymorphism.account;

public class Bank {
static Account account[]=new Account[5];
static int counter =0;
public static void addAccountNumber(SavingsAccount a) {
	account[counter]=a;
	counter++;
//	System.out.println(a.holderName);
}
public static void addAccountNumber(CurrentAccount a) {
	account[counter]=a;
	counter++;
}
public static void update() {
	for(int i=0;i<5;i++) {
		System.out.println("for "+ i+" ");
	if(account[i] instanceof SavingsAccount) {
	   account[i].addInterest();
	 System.out.println();
	}
	if(account[i] instanceof CurrentAccount) {
		if(account[i].account_balance<-account[i].getOverDraftLimit())
			System.out.println("Your Overdraft limit is reached");
		else
			System.out.println("You can OverDraft more");
		//System.out.println("instance of current account  :"+account[i].getOverDraftLimit());
	}
	
	}
}
	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount(1287812797,"Aishwary",500,5.5);
		SavingsAccount s1=new SavingsAccount(1287812797,"Aishwary",5000,5.5);
		CurrentAccount c=new CurrentAccount(12321,"asdufy",3423.00,10000);
		CurrentAccount c1=new CurrentAccount(12321,"asdufy",3423.00,10000);
//      double a= account[0].getAccountBalance();
//      System.out.println(a);
      update();
	}

}
