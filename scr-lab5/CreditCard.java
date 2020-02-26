/**
* This class represents the credit card, it has data fields 
* that include an owner of type Person, a balance of type 
* Money, and a creditLimit of type Money.
* 
* @author Yuehong Zhang 3109345 
* @version 2019-02-08
*/
public class CreditCard {
	// The owner of the credit card
	Person owner;
	// The balance of the credit card
	Money balance;
	//The credit limit of the credit card
	Money creditLimit;
	
	 /**
	  * Constructor
	  * 
	  * @param newCardHolder The credit card's card holder.
	  * @param limit the credit limit of the credit card.
	  */
	public CreditCard(Person newCardHolder, Money limit) {
		owner = newCardHolder;
		creditLimit = new Money(limit);
		balance = new Money(0);
	}
	
	/**
	 * The getBalance method
	 * 
	 * @return A reference to the balance object 
	 *         of type money.
	 */
	public Money getBalance() {
		return new Money(balance);	
	}
	
	/**
	 * The getBalance method
	 * 
	 * @return A reference to the creditLimit object 
	 *         of type money.
	 */
	public Money getCreditLimit() {
		return  new Money(creditLimit);
	}
	
	/**
	 * The getPersonals method
	 * The information about owner is printed out by calling 
	 * the toString method for the owner
	 * @return A string has the information about the owner.
	 */
	public String getPersonals() {
		return owner.toString();
	}
	
	/**
	 * The charge method
	 * Charge to the CreditCard by adding the amount passed 
	 * in the parameter to the balance, but only if it will 
	 * not exceed the creditLimit. otherwise an error message 
	 * can be printed to the console.
	 * @param amount the money amount that will be added 
	 *               to the balance
	 */
	public void charge(Money amount) {	
		if(balance.add(amount).compareTo(creditLimit)!=1) {
			balance = balance.add(amount);
			System.out.println("Charge: " + amount);
		}
		else
			System.out.println("Exceeds credit limit");	
	}
	
	/**
	 * The payment method
	 * Make a payment on the CreditCard by subtracting the 
	 * amount passed in the parameter from the balance.
	 * @param amount the money amount that will be subtracted 
	 *               form the balance
	 */
	public void payment(Money amount) {
		balance = balance.subtract(amount);
		System.out.println("Payment: " + amount);
	}
}
