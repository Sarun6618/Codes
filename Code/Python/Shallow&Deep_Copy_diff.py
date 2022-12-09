# Python code to demonstrate copy operations

# importing "copy" for copy operations
import copy

# initializing list 1
l1=list(tuple(map(int,input("Enter the list elements: ").split()))for r in range(int(input('enter no of rows : '))))
print(l1)
# using copy to shallow copy
li2 = copy.copy(l1)

# original elements of list
print ("The original elements before shallow copying")
for i in range(0,len(l1)):
	print (l1[i],end=" ")

print("\r")

# adding and element to new list
li2[2][0] = 7

# checking if change is reflected
print ("The original elements after shallow copying")
for i in range(0,len( l1)):
	print (l1[i],end=" ")

