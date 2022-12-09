"""
Penalty Payment:  
Gopal is a PET trainer. A PET task is assigned to a group of students and 
she gives them penalty points based on their mistakes. After the task, 
students have to pay in cash for the mistakes they make during the task.
For example, If 3 students have taken the task, and 
their penalty points are [6,11,8]. The students can pay the penalty amount in any order. 
Based on the order of payment, the amount they have to pay is calculated as: --
        Student-1 +        Student-2     +    Student-3
((2 pow 0) * 6) + ((2 pow 1) * 11) + ((2 pow 2) * 8) = 6 + 22 + 32 => 60 bucks to pay.
In the above case, students have to pay 60bucks. But students decided pay least amount, 
by following certain order. They paid the least amount as follows: --
       Student-2    +      Student-3    +    Student-1
((2 pow 0) * 11) + ((2 pow 1) * 8) + ((2 pow 2) * 6) = 11 + 16 + 24 => 51 bucks to pay. 
You can help the students, to calculate the least amount to pay as penalty.
INPUT FORMAT:
Line-1: an integer N, indicates the number of students participated in task.
Line-2: N number of positive integers, indicates penalty
points of N students.
OUTPUT FORMAT
An integer, indicates the least amount of bucks they have to pay.
Sample test cases:
case=1
Input
4
9  6  11  5
Output
93
Explanation
Student-1 : 9, Student-2 : 6,
Student-3 : 11, Student-4 : 5
Students will pay the amount in the following order:
     Student-3      +      Student-1    +     Student-2      + Student-4
((2 pow 0) * 11) + ((2 pow 1) * 9) + ((2 pow 2) * 6) + ((2 pow 3) * 5) = 11 + 18 + 24 + 40
least amount of bucks, students have to pay is =>93
------------------------------------------------------------
case=2
Input
3
6 11 8
Output
51
Explanation
Student-1 : 6, Student-2 : 11,
Student-3 : 8, 
Students will pay the amount in the following order:
Student-2 + Student-3 + Student-1
((2 pow 0) * 11) + ((2 pow 1) * 8) + ((2 pow 2) * 6) +
= 11 + 16 + 24
least amount of bucks, students have to pay is =>51
"""
n=int(input())
l=list(map(int,input().split()))
l.sort(reverse=True)
x=[]
for i in range(n):
    a=2**i*l[i]
    x.append(a)
print(sum(x))