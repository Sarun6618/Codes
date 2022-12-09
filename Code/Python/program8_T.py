"""Let us assume paper as the plane and a letter as a curve on the plane, then each letter 
divides the plane into regions. For example letters "A", "D", "O", "P", "R" divide the 
plane into two regions so we say these letters each have one hole. Similarly, letter "B" has 
two holes and letters such as "C", "E", "F", "K" have no holes. We say that the number of 
holes in the text is equal to the total number of holes in the letters of the text. Write a 
program to determine how many holes are in a given text.
Sample input & output:
Enter string: HELLO STUDENTS
Number of holes in given text: 2
"""
x=input("Enter string: ")
c=0
H1=["A", "D", "O", "P", "R",'Q']
H2=["B"]
#H0=['C','E','F','G','H','I','J','K','L','M','N','S','T','U','V','W','X','Y',"Z"]
for i in x:
    if i in H1:
        c+=1
    elif i in H2:
        c=c+2
print("Number of holes in given text: ",c)