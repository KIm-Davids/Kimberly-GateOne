public class AtmMachine {

	//ArrayList<double> AtmMachine = new ArrayList<Double>();

	private String name;
	private int pin;
	private double balance;
	private double deposit;
	private double withdraw;
	private double transferAmount;
	private String newAccount;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
		
	public void setPin(int pin){
		this.pin = pin;
	}

	public int getPin(){
		return pin;
	}

	public void setBalance(double balance){
		if(balance > 0.0){
			this.balance = balance;
		}
	}
		
	public double getBalance(){
		return balance;
	}

	public void setDeposit(double deposit){
		if(deposit > 0.0){
			this.balance = balance + deposit;
		}
	}

	public double getDeposit(){
		return deposit;
	}

	public void setWithdraw(double withdraw){
		this.balance = balance - withdraw;
	}

	public double getWithdraw(){
		return withdraw;
	}

	public void setsecondUser(double transferAmount){
		this.balance = balance - transferAmount;
	}

	public double gettransferAmount(){
		return transferAmount;
	}

	public void setnewUserAccountNumber(String accountNumber){
		this.newAccount = accountNumber;
	}
	
	public String getaccountNumber(){
		return newAccount;
	}

}
