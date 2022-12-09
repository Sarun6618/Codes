"""
Write a program to check whether the given number is Consecutive Four Sum Number or 
not. Consecutive Four Sum Number: A positive integer is called as a ‘Consecutive Four 
Sum (CFS) number’ if that number can be expressed as the sum of four consecutive 
positive integers.
Sample input & output 1:
Enter an integer: 50
50 is Consecutive Four Sum Number
Sample input & output 2:
Enter an integer: 17
17 is not Consecutive Four Sum Number
"""
"""1+2+3+4 is a CFs then x+x+1+x+2+x+3=4x+6->4x=n/6 n is the input value"""
n =int(input("Enter an integer: "))
for i in range(1,n):
    if(4*i==n-6):
        print(n," is Consecutive Four Sum Number")
        break;
else:
    print(n," is not Consecutive Four Sum Number")