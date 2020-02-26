/**
 * Creat a SavingsAccount class that is derived from BankAccount class.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-03-01
 *
 */
public class SavingsAccount extends BankAccount {
	//Number represents the annual interest rate.
	private double rate = 0.025;
	//Number to identify different savings accounts for the same account number
	private int savingsNumber = 0;
	//Number bank uses to identify account, will hide the accountNumber from the superclass
	private String accountNumber;
	
	/**
	 * Standard constructor
	 * @param name The owner of the savings account.
	 * @param amount The beginning balance.
	 */
	public SavingsAccount(String name, double amount){
		super(name, amount);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
	
	/**
	 * Copy constructor creates another savings account for the same owner.
	 * @param oldAccount The savings account with information to copy.
	 * @param amount The beginning balance of the new savings account.
	 */
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber = oldAccount.savingsNumber+1;
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
	
	/**
	 * The postInterest method calculate one month's worth of interest 
	 * on the balance and deposit it into the account.
	 */
	public void postInterest() {
		double newBalance = super.getBalance()*(1+rate/12);
		super.setBalance(newBalance);
	}
	
	/**
	 * The getAccountNumber method returns the accountNumber,this 
	 * will override the getAccountNumber method in superclass.
	 * @return accountNumber the account number.
	 */
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
}
