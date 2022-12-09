def swaplist(L1):
    n=len(L1)
    temp=L1[0]
    L1[0]=L1[n-1]
    L1[n-1]=temp
    return L1
L1=list(map(int,input().split()))
print(swaplist(L1))