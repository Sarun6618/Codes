print("Enter list elements: ",end=" ")
l1=list(map(int,input().split()))
l1=list(set(l1))
print("The list after removing duplicates using sets: "+str(l1))