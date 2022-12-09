x=input()
c=input()
t=0
j=0
for i in c:
    l=x.find(i)
    t+=abs(l-j)
    j=l
print(t)