/*
You have given N bricks.
You need to construct a staircase as follows:
	1. =
	2. ==
	3. ===
	4. ====
Where = indicates one brick.

Another condition is row-1 should have 1 brick, row-2 should have 2 bricks and so on.
i.e., i-th row should have 'i' bricks.

Your task is to findout total number of staircases can be formed with the given condition.

Input Format:
-------------
An integer N

Output Format:
--------------
Print an integers, number of staircases


Sample Input-1:
---------------
5

Sample Output-1:
----------------
2

Explanation:
------------
row-1:	=
row-2:	==
row-3:	==
Only 2 rows satisfies the condition.


Sample Input-2:
---------------
8

Sample Output-2:
----------------
3

Explanation:
------------
row-1:	=
row-2:	==
row-3:	===
row-4:	==

Only 3 rows satisfies the condition.

=== testcases ===
case =1
input =5
output =2

case =2
input =8
output =3

case =3
input =9999
output =140

case =4
input =96786765
output =13912

case =5
input =965456
output =1389

case =6
input =876842
output =1323

case =7
input =213465278
output =20661

case =8
input =2147483647
output =65535

ArrangeCoins
*/

import java.util.*;

class D8P3
{
	public int arrangeCoins(int n) {
		long left = 0, right = n;
		long k, curr;
		while (left <= right) {
			  k = left + (right - left) / 2;
			  curr = k * (k + 1) / 2;

			  if (curr == n) return (int)k;

			  if (n < curr) {
					right = k - 1;
			  } else {
					left = k + 1;
			  }
		}
		return (int)right;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(new D8P3().arrangeCoins(num));
		sc.close();
	}
}
