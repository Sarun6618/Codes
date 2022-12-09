"""Write the following classes with class variables, instance variable and illustration the self
variableii) ATM (to deposit and withdraw amount from ATM machine)
steps:
-create a class , methods for withdraw and deposit
-balance is 50000
-if withdraw amount is greater than 50000  
  print Insufficient Balance or print the remaining balance
-if deposit add to balance
-print the updated balance
TestCase:
Sample Input & Output 1:
Enter the amount to withdraw: 9500
Remaining balance: 40500
Enter the amount to deposit: 2800
Updated balance: 43300
"""
class ATM():
    def __init__(self):
        self.balance=50000
    def withdraw(self):
        x=int(input("Enter the amount to withdraw: "))
        if(x>self.balance):
            print("Insufficient Balance")
            print("Remaining balance:",self.balance)
        else:
            self.balance-=x
            print("Remaining balance:",self.balance)
    def deposit(self):
        y=int(input("Enter the amount to deposit: "))
        self.balance+=y
        print("Updated balance:",self.balance)
a=ATM()
a.withdraw()
a.deposit()