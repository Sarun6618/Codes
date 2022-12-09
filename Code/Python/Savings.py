a=int(input("Enter rent of A-Block:"))
b=int(input("Enter rent of B-Block:"))
c=int(input("Enter rent of C-Block:"))
d=int(input("Enter his salary:"))
total=a+b+c+d
print(total)
if(total<50000):
    txt=total*0.6
    savings=total-txt
    print("Savings:",savings)
elif(total>50000 and total<100000):
    txt=total*0.9
    savings=total-txt
    print("Savings:",savings)
else:
    txt=total*0.95
    savings=total-txt
    print("Savings:",savings)
