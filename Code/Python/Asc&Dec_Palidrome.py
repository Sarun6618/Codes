print("Enter list elements: ",end=" ")
l1=list(map(int,input().split()))
print(l1)
if(l1==l1[::-1]):  
      print("The list is a palindrome")  
else:  
      print("The list is not a palindrome") 
# Sorting list of Integers in descending
l1.sort(reverse = True)
print(l1)
# Sorting list of Integers in ascending
l1.sort()
print(l1)

