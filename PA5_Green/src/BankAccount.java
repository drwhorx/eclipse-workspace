import java.util.*;

public class BankAccount {
	private double balance;
	private double APR;

	/**
	 * Create a new Bank Account
	 * 
	 * @return {@code void}
	 */
	BankAccount() {
		balance = 0;
		APR = 0;
	}

	/**
	 * Create a new Bank Account.
	 * 
	 * @param initBal Initial Balance
	 * @param initAPR Initial APR
	 * @return {@code void}
	 */
	BankAccount(double initBal, double initAPR) {
		balance = initBal;
		APR = initAPR;
	}

	/**
	 * Set the balance of your account.
	 * 
	 * @param bal New balance
	 * @return {@code void}
	 */
	public void setBalance(double bal) {
		balance = bal;
	}

	/**
	 * Set the APR of your account
	 * 
	 * @param apr New APR
	 */
	public void setAPR(double apr) {
		APR = apr;
	}

	/**
	 * Get the balance of your account.
	 * 
	 * @return {@code double}
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Deposit money into your balance.
	 * 
	 * @param dep State an amount to deposit.
	 * @return {@code void}
	 */
	public void deposit(double dep) {
		balance += dep;
	}

	/**
	 * Withdraw an amount from your balance.
	 * 
	 * @param with State an amount to withdraw.
	 * @return {@code void}
	 */
	public void withdraw(double with) {
		balance -= with;
	}

	/**
	 * Add a monthly interest your balance for a certain amount of months.
	 * 
	 * @param months Amount of months
	 */
	public void addMonthlyInterest (int months) {
		for (int i = 0; i < months; i++) {
			balance = balance * (1 + (APR / 12));
		}
	}
	
	/**
	 * Add a monthly interest your balance for a certain amount of years.
	 * 
	 * @param years Amount of years.
	 */
	public void addYearlyInterest(int years) {
		int months = years * 12;
		for (int i = 0; i < months; i++) {
			balance = balance * (1 + (APR / 12));
		}
	}
	
	/**
	 * Add interest and deposit to your account for a certain amount of months.
	 * @param months
	 * @param dep
	 */
	public void addInterestAndDeposit(int months, double dep) {
		for (int i = 0; i < months; i++) {
			balance = balance * (1 + (APR / 12));
			balance += dep;
		}
	}
}
