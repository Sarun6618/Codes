print("Enter list elements: ",end=" ")
l1=list(map(int,input().split()))
res=[]
[res.append(x) for x in l1 if x not in res]
print("The list after removieng duplicates: "+str(res))