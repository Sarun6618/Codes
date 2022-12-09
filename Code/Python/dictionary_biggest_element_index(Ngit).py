n=int(input())
for i in range(n):
    line=input()
    rline=line.split()
    name=rline[0]
    l1=[]
    for j in range(1,len(rline)):
        l1.append(int(rline[j]))
    me=max(l1)
    mind=l1.index(me)
    print(name,mind)
