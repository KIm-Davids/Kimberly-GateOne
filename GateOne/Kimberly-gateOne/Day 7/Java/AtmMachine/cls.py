import random

class Bank:
    
    def __init__(self,balance = 0) -> None:
        self.balance = balance
        self.name = ""
        self.pin = 0
        self.account_number = 0

    def get_balance(self):
        return self.balance
    def get_name(self):
        return self.name
		
    def get_account_number(self):
        return self.account_number
		
    def get_pin(self):
        return self.pin
		
    def set_balance(self,balance):
        self.balance = balance

    def set_name(self,name):
        self.name = name
    def set_withdraw(self,withdraw):
        self.balance -= withdraw

    def set_deposit(self,deposit):
        self.balance += deposit

    def set_account_number(self,account_number):
        self.account_number = account_number

    def set_pin(self,pin):
        self.pin = pin
  
    def __str__(self):
	    return f" Customer name: {self.name}\n customer account number: {self.account_number}\n Customer Balance: {self.balance}"