import java.time.LocalDate;

public class Account {
	String account_no = null;
	double balance = 0.0;
	LocalDate date_created = null;
	Customer customer = null;
	String type = null;
	
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
	Boolean transfer_amount(double amount, Account reciever_acc)
	{
		
		return true;
	}
}