a=int(input("Enter the number of new recruit:"))
b=[]
c=int(input("Enter the number of old recruit:"))
for i in range(a):
    b.append(c)
    c=c+1
print(b)
teamA=[]
teamB=[]
for i in b:
    if(i%2==0 & i%3==0):
        teamA.append(i)
    else:
        teamB.append(i)
print(teamA)
print(teamB)

