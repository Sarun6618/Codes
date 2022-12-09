from turtle import color
import numpy as np
import matplotlib.pyplot as plt
y1=list(map(int,input().split()))
y2=list(map(int,input().split()))
y3=list(map(int,input().split()))
y4=list(map(int,input().split()))
box_plot_data=[y1,y2,y3,y4]
box=plt.boxplot(box_plot_data,vert=0,patch_artist=True,labels=['1','2','3','4'])
colors=['cyan','lightblue','lightgreen','tan']
for patch,color in zip(box['boxes'],colors):
    patch.set_facecolor(color)
plt.show()