/*Mr.John is experimenting with numbers. Some of the numbers he discovered 
are U-Turn Numbers. A U-Turn number is defined as a legitimate numbe,
if the provided number 'X' is turned in a U shape (Mirror image of the number X 
horizontally as Xh and Mirror image of the number Xh vertically as Xv) 
and then X is valid if 'X'='Xv'. Otherwise, 'X' is not a U-Turn number.
i.e, 11 is a U-Turn Number, 6969 is a legal U-Turn Number, 
where as 696, 161 and 343 are not valid U-Turn Numbers.
Mr. John is handed the integer L, which represents the length of U-Turn number.
Your task is to help Mr. John in finding all U-Turn numbers with length L 
in the number system and print them in sorted order.
Note: U-Turn number is always a positive integer, because if you turn -11 
in U shape, it will be 11-, which is not a valid number.
Input Format:
-------------
An integer L, the length of U-Turn numbers. 
Output Format:
--------------
Print the list of U-Turn numbers of length L.
Sample Input-1:
---------------
1
Sample Output-1:
----------------
[0, 1, 8]
Sample Input-2:
---------------
2
Sample Output-2:
----------------
[11, 69, 88, 96]
Note: Look at the Hint*/