/**
 * Creat a CheckingAccount class that is derived from BankAccount class.
 *
 * @author Yuehong Zhang 3109345
 * @version 2019-03-01
 *
 */
public class CheckingAccount extends BankAccount {
	//Constant that represents the cost of clearing one check
	private static final double FEE = 0.15;
	
	/**
	 * Standard constructor
	 * @param name The owner of the account.
	 * @param amount The beginning balance.
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		String newAccountNumber = super.getAccountNumber()+"-10";
		super.setAccountNumber(newAccountNumber);
	}
	
	/**
	 * The withdraw method take the amount to withdraw, 
	 * add to it the fee for check clearing, return true 
	 * if the transaction was completed, return false 
	 * if there was not enough money, this method overrides 
	 * the superclass method.
	 * @return  True if there was sufficient funds to complete
	 *  the transaction, false otherwise.
	 */
	@Override
	public boolean withdraw(double amount) {
		double amountWithFee = amount +FEE;
		return super.withdraw(amountWithFee);
	}
	
}
