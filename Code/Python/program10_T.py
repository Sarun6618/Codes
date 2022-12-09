"""
Write a function named collatz() that has one parameter named number. If number is 
even, then collatz() should print number // 2 and return this value. If number is odd, then 
collatz() should print and return 3 * number + 1. Then write a program that lets the user 
type in an integer and that keeps calling collatz() on that number until the function returns 
the value 1. Input Validation: Add try and except statements to detect whether the user 
types in a non-integer string. In the except clause, print a message to the user saying they 
must enter an integer
test case1:
Enter a number: 5                                                                                                       
16 8 4 2 1
testcase2:
Enter a number: asha                                                                                                    
Please enter a valid INTEGER  
"""
def collatz(number):
    if number%2==0:
        number=(number//2)
    else:
        number=(3*number+1)
    return number
try:
    number=(int(input("Enter a number: ")))
    while number!=1:
        number=collatz(number)
        print(number,end=" ")
except ValueError:
    print("Please enter a valid INTEGER")
