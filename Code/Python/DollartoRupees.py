a=int(input("Enter the number of elements:"))
b=list(map(float,input("Enter the elements of list:").split()))
c=int(input("Enter dollar rate:"))
d=[]
for i in b:
    x=i//c
    d.append(x)
print(d)