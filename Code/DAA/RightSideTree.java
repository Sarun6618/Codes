/*
Balbir singh is working with Binary Trees.
The elements of the tree is given in the level order format.
Balbir is looking the tree from right side. 
So, he can view only rightmost nodes only (one node per level).

You will be given the root of the binary tree.
Your task is to find the nodes which can be viewed by Balbir from right side.
And print the nodes from top to bottom order.

Your task is to implement the class Solution:
	- public List<Integer> rightSideView(BinaryTreeNode root):
	return the list of node values.
	
NOTE: 
Please do consider the node with data '-1' as null node in the given trees.

Input Format:
-------------
Space separated integers, elements of the tree.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
1 2 3 5 -1 -1 5

Sample Output-1:
----------------
[1, 3, 5]



Sample Input-2:
---------------
3 2 4 3 2

Sample Output-2:
----------------
[3, 4, 2]


*/
import java.util.*;

class BinaryTreeNode{
    	public int data; 
    	public BinaryTreeNode left, right; 
    	public BinaryTreeNode(int data){
    		this.data = data; 
    		left = null; 
    		right = null; 
    	}
    }
class Solution {
    public List<Integer> rightSideView(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q=new LinkedList<>();
        List<Integer>res=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                BinaryTreeNode p=q.poll();
                if(p.left!=null && p.left.data!=-1)
                q.offer(p.left);
                if(p.right!=null && p.right.data!=-1)
                q.offer(p.right);
                l.add(p.data);
            }
            res.add(l.get(l.size()-1));
        }
        return res;
    }
}
public class RightSideTree {
	static BinaryTreeNode root;
	static BinaryTreeNode temp = root;
	void insert(BinaryTreeNode temp, int key)
    {
 
        if (temp == null) 
        {
            root = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) 
        {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) 
            {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) 
            {
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
        sc.close();
		RightSideTree bt=new RightSideTree();
		root=new BinaryTreeNode(Integer.parseInt(str[0]));
		for(int i=1; i<str.length; i++)
			bt.insert(root,Integer.parseInt(str[i]));
		Solution sol= new Solution();
		System.out.println(sol.rightSideView(root));
	}
}