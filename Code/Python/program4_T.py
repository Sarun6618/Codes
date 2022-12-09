"""
Given a positive integer 'x' (with even number of digits in it), compute the difference 
between the sum of the digits occurring in the alternate positions (starting from the first 
position) and the sum of the digits occurring in the alternate positions, starting from the 
last rightmost position of 'x'.
Sample input & output 1: 
Enter an integer: 152
Invalid number
Sample input & output 2:
Enter an integer: -25
Invalid number
Sample input & output 3:
Enter an integer: 12345678
Difference between the sums of the digits occurring in the alternate positions: 4
"""
x=int(input("Enter an integer: "))
if x<0:
    print("Invalid number")
else:
    y=[int(i) for i in str(x)]
    k=[]
    l=[]
    c=len(y)
    if x>0 and c%2==0:
        for index in range(len(y)):
            if index%2==0:
                k.append(y[int(index)])
            else:
                l.append(y[int(index)])
    t=sum(k)
    s=sum(l)
    n=abs(t-s)
    print("Difference between the sums of the digits occurring in the alternate positions: ",n)