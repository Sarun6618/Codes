import numpy as np
import matplotlib.pyplot as plt
y=list(map(int,input().split()))
fig=plt.figure(figsize=(10,7))
bp=plt.boxplot(y)
bp1=plt.boxplot(y,vert='0')
plt.show()