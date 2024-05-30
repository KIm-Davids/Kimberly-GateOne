import java.util.*;
public class Bank{

	private List <NewUserAccount> accountNumbers = new ArrayList <>();
	
	public void addAccountName(NewUserAccount name){
		this.accountNumbers.add(name);
	}
	
	public void addAccountNumber(NewUserAccount accountNumber){
		this.accountNumbers.add(accountNumber);
	}
	
	public void addAccountPin(NewUserAccount pin){
		this.accountNumbers.add(pin);
	}

	public void addAccountBalance(NewUserAccount balance){
		this.accountNumbers.add(balance);
	}

	public void removeAccountName(NewUserAccount name){
		this.accountNumbers.remove(name);
	}
	
	public void removeAccountNumber(NewUserAccount accountNumber){
		this.accountNumbers.remove(accountNumber);
	}
	
	public void removeAccountPin(NewUserAccount pin){
		this.accountNumbers.remove(pin);
	}

	public void removeAccountBalance(NewUserAccount balance){
		this.accountNumbers.remove(balance);
	}

	public String tostring(){
		return String.valueOf(accountNumbers);
	}

}