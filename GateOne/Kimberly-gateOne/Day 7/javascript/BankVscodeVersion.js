
class Bank{
    constructor(){
        this._name = "";
        this._accountNumber = "";
        this._pin = 0;
        this._balance = 0
        this._deposit = 0
        this._withdraw = 0
        this._transfer = 0
    }

    setName(name){
        this._name = name
    }
    getName(){
        return this._name;
    }

    setAccountNumber(accountNumber){
        this._accountNumber = accountNumber
    }

    getAccountNumber(){
        return this._accountNumber;
    }
    setPin(pin){
        this._pin = pin
    }

    getPin(){
        return this._pin
    }

    setBalance(balance){
        this._balance = balance
    }

    setDeposit(deposit){
        this._balance += deposit
    }
    
    getDeposit(){
        return this._deposit
    }

    setWithdraw(withdraw){
        this._balance -= withdraw
    }

    getWithdraw(){
        return this._withdraw
    }

    setTransfer(transfer){
        this._balance -= transfer
    }

    getTransfer(){
        return this._transfer
    }

    getBalance(){
        return this._balance
    }
}
module.exports = Bank;