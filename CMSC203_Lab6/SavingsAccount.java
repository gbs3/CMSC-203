
public class SavingsAccount extends BankAccount
{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-" + savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		savingsNumber++;
		super.setAccountNumber((numberOfAccounts-1) + "-" + savingsNumber);
	}
	
	public void postInterest()
	{
		double monthlyInt = super.getBalance() * rate;
		super.deposit(monthlyInt/12);
	}
	
	public String getAccountNumber()
	{
		return super.getAccountNumber();
	}

}
