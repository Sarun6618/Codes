"""
The Even Series: 
The Math Teacher of class 5 has taught the students the concept of even and odd numbers. 
She now wants to test them and has written a long number N(containing 1-9 digits) 
on the board and has asked each student from the class to stand up, 
count the number of even digits(2,4,6,8) in the number from left to right. 
The first student, say j(1<=j<=|N|)), starts from the first digit, 
counts the even digits till the end of the number , 
writes it on a chit/paper and gives it to the teacher. 
The next student starts at second digit and follows the same process. 
This process goes on till the last digit of the number. 
Help the math teacher write the count at every index.
Input:
The number N(Take N as string)
Output:
Display |N| space separated integers, the result at every index.
Limits:
1 <=|N|<= 10 power 4
Sample test cases:
Case=1
Input
352454324472
Output
7 7 7 6 5 5 4 4 3 2 1 1
Note: Assuming indexing starts at 1
Input:
Given the long number N is 352454324472.
Output:
Position 1:
Count of even digits from 3 to end of the number is
7 Result at position-1 is 7.
Position 2:
Count of even digits from 5 to end of the number is
7 Result at position-2 is 7.
Position3:
Count of even digits from 2 to end of the number is
7 Result at position-3 is 7.
Position4:
Count of even digits from 4 to end of the number is
6 Result at position4 is 6.....
.
.
so on and so forth
---------------------------------------------------
Case=2
Input
759359731
Output
0 0 0 0 0 0 0 0 0
Case=3
Input
812345675621
Output
6 5 5 4 4 3 3 2 2 2 1 0 
"""
x=input()
k=[int(i) for i in str(x)]
l=[]
count=0
for i in range(len(x)):
    for j in k:
        if j%2==0:
            count+=1
    l.append(count)
    count=0
    k.pop(0)
print(*l)