import numpy as np
y1=list(map(int,input().split()))
q1,q2,q3=np.quantile(y1,[0.25,0.5,0.75],interpolation='midpoint')
print(q1,q2,q3)
iqr=q3-q1
print(iqr)