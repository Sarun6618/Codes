"""1+2+3+4 is a CFs then x+x+1+x+2+x+3=4x+6->4x=n/6 n is the input value"""
n =int(input("Enter a Number: "))
k=[]
for i in range(1,n):
    if 4*i+6==n:
        k.append(n)
        m=i
if len(k)==0:
    print("Is not a consecutive numbers")
else:
    print("Is a consecutive numbers")
    print(m,m+1,m+2,m+3)
