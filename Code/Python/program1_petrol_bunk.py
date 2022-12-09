"""
Indian oil corporation constructing two new petrol bunks with different height
of containers. write a python program to find which petrol bunk has the maximum
capacity two store petrol.
Note:Given n integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most petrol.
containers height 4 2 8 3 6 means its vertical lines.
case 1:
Enter containers height 1:4 2 7 3 6                                                                                     
Enter containers height 2:7 2 6 4                                                                                       
container 1 stores 16 liters petrol
case 2:
Enter containers height 1:3 6 8 2 1                                                                                     
Enter containers height 2:7 6 3 4 5                                                                                     
container 2 stores 20 liters petrol
case 3:
Enter containers height 1:4 2 9 6                                                                                       
Enter containers height 2:4 2 9 6                                                                                       
both container stores 12 liters petrol
"""
def marea(A,L):
    area=0
    for i in range(L):
        for j in range(i+1,L):
            area=max(area,min(A[i],A[j])*(j-i))
    return area

a=list(map(int,input("Enter containers height 1:").split()))
b=list(map(int,input("Enter containers height 2:").split()))
l1=len(a)
l2=len(b)
c1=marea(a,l1)
c2=marea(b,l2)
if(c1>c2):
    print("container 1 stores {0} liters petrol".format(c1))
elif(c2>c1):
    print("container 2 stores {0} liters petrol".format(c2))
else:
    print("both container stores {0} liters petrol".format(c1))