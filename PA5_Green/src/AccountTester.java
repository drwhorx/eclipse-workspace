public class AccountTester {
	
	public static void main(String[] args){

		BankAccount mySavings = new BankAccount(200, 0.05);

		System.out.println(mySavings.getBalance());
		System.out.println("Expected balance: 200.0");

		mySavings.deposit(300);
		System.out.println(mySavings.getBalance());
		System.out.println("Expected balance: 500.0");

		mySavings.addMonthlyInterest(2);
		System.out.println(mySavings.getBalance());
		System.out.println("Expected balance: 504.175");

		mySavings.setBalance(100);
		mySavings.addYearlyInterest(1);
		System.out.println(mySavings.getBalance());
		System.out.println("Expected balance: 105.12");

		mySavings.setBalance(100);
		mySavings.addInterestAndDeposit(12, 50);
		System.out.println(mySavings.getBalance());
}
}