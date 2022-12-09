import numpy as np
import matplotlib.pyplot as plt
y1=list(map(int,input().split()))
y2=list(map(int,input().split()))
y3=list(map(int,input().split()))
y4=list(map(int,input().split()))
box_plot_data=[y1,y2,y3,y4]
fig=plt.figure(figsize=(9,8))
bp=plt.boxplot(box_plot_data)
plt.show()