#method-1
T=int(input())
N,K=map(int,input().split())
L1=list(map(int,input().split()))
for i in range(K):
    L1=L1[-1:]+L1[:-1]
print(L1)
#print in other way
print(*L1,sep=" ")
#method-2
T=int(input())
N,K=map(int,input().split())
L1=list(map(int,input().split()))
for i in range(K):
    L1.insert(0,L1.pop())
print(*L1,sep=" ")
#method 3
import numpy as np
T=int(input())
N,K=map(int,input().split())
L1=list(map(int,input().split()))
l2=np.roll(L1,K)
print(*L1,sep=" ")