"""
Value of an array is defined as the sum of the absolute differences between pairs of consecutive elements in the array. Formally, for a given array A = {A1, A2, A3, ... , An}, value(A) = |A1 - A2| + |A2 - A3| + |A3 - A4| + ... + |An-1 - An|, where |x| means the absolute value of x.
You will be given an array A of n integers and q updates. Each update will have two integers x and y where x index value should be replaced with y and remove the element which before the x index . output the value of the new array.
Case=1
Enter No of Iterations: 2                                                                                               
Enter the no of intergers and updates as n and q:5 1                                                                    
Enter the list elements:5 8 7 9 6                                                                                       
Enter the update values:4 3                                                                                             
The list elements after updation:  [5, 8, 7, 3, 6]                                                                      
The sum of absolute difference is:  11                                                                                  
Enter the no of intergers and updates as n and q:4 2                                                                     
Enter the list elements:1 2 3 5 5                                                                                       
Enter the update values:4 4                                                                                             
The list elements after updation:  [1, 2, 3, 4, 5]                                                                      
The sum of absolute difference is:  3                                                                                   
Enter the update values:1 8                                                                                             
The list elements after updation:  [8, 2, 3, 4, 5]                                                                      
The sum of absolute difference is:  8                                                                                                
  
"""
n=int(input("Enter No of Iterations: "))
s=0
for i in range(n):
    a=input("Enter the no of intergers and updates as n and q:").split()
    l=list(map(int,input("Enter the list elements:").split()))
    for i in range(int(a[1])):
        u=input("Enter the update values:").split()
        l[int(u[0])-1]=int(u[1])
        print("The list elements after updation:  ",l)
        for i in range(int(a[0])-1):
            s+=abs(l[i]-l[i+1])
        print("The sum of absolute difference is:  ",s)
        s=0