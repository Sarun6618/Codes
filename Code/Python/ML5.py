import numpy as np
import matplotlib.pyplot as plt
y1=list(map(int,input().split()))
y2=list(map(int,input().split()))
fig=plt.figure(figsize=(10,7))
bp=plt.boxplot(y1)
fig=plt.figure(figsize=(10,7))
bp=plt.boxplot(y2)
plt.show()