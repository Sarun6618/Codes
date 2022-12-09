/*
There are B bags containing N gold boxes each. In each bag, N gold boxes are 
with certain weights that are arranged according to weights from smallest 
to largest arranged strictly.
Create a method in such a way that we need to return the least weight of 
gold box which is common in all the given bags. If we don’t have any 
least common weight of gold box in any bag then return -1.

Input Format:
-------------
Line-1: Two integers B and N, number of bags and number of goldboxes in each Bag.
Next B lines: N space separated integers, weights of GoldBoxes.

Output Format:
--------------
Print the least weight of gold box, if found
Print -1, if not found.


Sample Input:
---------------
5 5
1 2 3 4 5
2 3 6 7 9
1 2 3 5 8
1 3 4 6 8 
2 3 5 7 8

Sample Output:
----------------
3
*/