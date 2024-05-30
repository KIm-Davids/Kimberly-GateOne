
class Bank{
    constructor(name, accountNumber, pin,){
        this.name = "";
        this.accountNumber = 0;
        this.pin = 0;
        
    }

    set name(name){
        this.name = name
    }
    get name(){
        return this.name;
    }

    set accountNumber(accountNumber){
        this.accountNumber = accountNumber
    }

    get accountNumber(){
        return this.accountNumber
    }
    set pin(pin){
        this.pin = pin
    }

    get pin(){
        return this.pin
    }

    set balance(balance){
        this.balance = balance
    }

    get balance(){
        return this.balance
    }
}