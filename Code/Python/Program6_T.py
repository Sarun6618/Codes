"""
Write a program to create a list of tuples from given list having number and its cube in 
each tuple.
Sample input & output:
Enter numbers: 8 6 4 3 7 9
List of tuples: [(8, 512), (6, 216), (4, 64), (3, 27), (7, 343), (9, 729)]
"""
print("Enter numbers: ",end=" ")
l1=list(map(int,input().split()))
res=[(i,i**3)for i in l1]
print("List of tuples: ",res)