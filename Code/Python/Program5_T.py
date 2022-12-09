"""
Given a number A which contains only digits 0's and 1's. Your task is to make all digits 
same by just flipping one digit (i.e. 0 to 1 or 1 to 0) only. If it is possible to make all the 
digits same by just flipping one digit then print 'YES' else print 'NO'.
Sample input & output 2:
Enter a number which contains only digits 0's and 1's: 1111101
YES
Sample input & output 3:
Enter a number which contains only digits 0's and 1's: 0001000
YES
"""
A=input("Enter a number which contains only digits 0's and 1's: ")
z=0
o=0
for i in range(len(A)):
    if(A[i]=="0"):
        z+=1
    elif(A[i]=="1"):
        o+=1
if(z==1 or o==1):
    print("YES")
else:
    print("NO")
