x=int(input("Enter an integer with even number of digits in it:"))
y=[int(i) for i in str(x)]
k=[]
l=[]
for index in range(len(y)):
    if index%2==0:
        k.append(y[index])
    else:
        l.append(y[index])
    
t=sum(k)
s=sum(l)
print(t-s)