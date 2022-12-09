class Robot:
    def __init__(self):
        self.name=str(input("Enter Your Name:"))
    def greet(self):
        print("Hello ",self.name)
x=Robot()
x.greet()

class ATM(Robot):
    def __init__(self):
        self.PIN=int(input("Enter Your PIN:"))
        self.balance=float(input("Enter your Balance"))
    def balance(self):
        return self.balance
    def ChangePIN(self):
        S=int(input("Enter Currect PIN:"))
        if(S==self.PIN):
            S1=int(input("Enter New PIN:"))
            S2=int(input("Confirm Your PIN:"))
            if(S1==S2):
                self.PIN=S1
                print("Passward Changed Successful")
            elif(S1!=S2):
                print("Not Matched")
            else:
                print("Wrong Passward")
        else:
            print("Incorrect Correct PIN")
    def checkbalance(self):
        print("Your Balance",self.balance)
    def withdraw(self):
        x=float(input("Enter the amount:"))
        if(x>self.balance):
            print("Amount not sefficient")
        else:
            self.balance-=x
            print(self.name,"Your Balance Remaining:",self.balance)
    def deposit(self):
        y=int(input("Enter amount to deposite:"))
        self.balance+=y
        print(self.name,"Your Total Balance:",self.balance)
A=ATM()
B=int(input("Enter PIN:"))
if(B==A.PIN):
    n=input("Enter 0 to check balance,1 to withdraw,2 to deposite,3 to change PIN: ")
    if(n=="0"):
        A.checkbalance()
    elif(n=="1"):
        A.withdraw()
    elif(n=="2"):
        A.deposit()
    elif(n=="3"):
        A.ChangePIN()
    else:
        print("Option not give")
else:
    print("Incorrect PIN")