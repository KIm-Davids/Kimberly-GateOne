public class NewUserAccount{
    
    private String userName;
    private long userAccountNumber;
    private int userPin;


    public NewUser1(String name, long accountNumber, int pin){
        this.userName = name;
        this.userAccountNumber = accountNumber;
        this.userPin = pin;
    }

    public String getUserName(){
        return userName;
    }

    public long getUserAccountNumber(){
        return userAccountNumber;
    }

    public int getUserPin(){
        return userPin;
    }
}
