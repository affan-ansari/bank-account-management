import java.time.LocalDate;

public class Account {
	String account_no = null;
	double balance = 0.0;
	LocalDate date_created = null;
	Customer customer = null;
	String type = null;
	double interest = 0.0;
	
	double check_balance()
	{
		return balance;
	}
	
	void print_statement()
	{
		
	}
	
	void make_deposit(double amount)
	{
		balance += amount;
	}
	
	Boolean make_withdrawal(double amount)
	{
		if(type.equals("saving"))
		{
			if(balance - amount >= 0)
			{
				balance -= amount;
				return true;
			}
			else
				return false;
		}
		else
		{
			if(balance - amount >= -5000)
			{
				balance -= amount;
				return true;
			}
			else
				return false;
		}
	}
	Boolean transfer_amount(double amount, Account reciever_acc)
	{
		if(balance - amount >= 0)
		{
			balance -= amount;
			reciever_acc.balance += amount;
			return true;
		}
		else
			return false;
	}
}