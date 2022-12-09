n=int(input())
d={}
for i in range(1,n+1):
    d[i]=i**3
sorted(d)
for i in range(1,n+1):
    print(i,d[i])
