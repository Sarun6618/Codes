a=int(input("Enter the number of elements:"))
b=list(map(int,input("Enter the elements of list:").split()))
c=[]
for i in b:
    if i not in c:
        c.append(i)
        c.sort()
print("Max of 1:",c[-1],"\nMax of 2:",c[-2])