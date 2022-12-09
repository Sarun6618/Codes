l=list(map(int,input("Enter the 10 elements:").split()))
print(len(l))
print(l)
l1=[]
l2=[]
if len(l)>=10:
    for i in l:
        if(i%2==0):
            l1.append(i)
        else:
            l2.append(i)
    print(l1)
    print(l2)
else:
    print("insufficient numbers of elements")