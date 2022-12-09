import java.util.*;
//Node reference
class BoundaryOfBTNode{
	public int data; 
	public BoundaryOfBTNode left, right; 
	public BoundaryOfBTNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}
public class Solution {
    List<Integer>nodes=new ArrayList<>(1000);
    public List<Integer> compoundWall(BoundaryOfBTNode root) {
        //implement your code here.
        if(root==null || root.data==-1)
        return nodes;
        nodes.add(root.data);
        leftboundary(root.left);
        leaves(root.left);
        leaves(root.right);
        rightboundary(root.right);
        return nodes;
    }
    public void leftboundary(BoundaryOfBTNode root)
    {
        if(root==null||root.data==-1||((root.left==null||root.left.data==-1)&&(root.right==null||root.right.data==-1)))
        return;
        nodes.add(root.data);
        if(root.left==null||root.left.data==-1)
        leftboundary(root.right);
        else
        leftboundary(root.left);
    }
    public void rightboundary(BoundaryOfBTNode root)
    {
        if(root==null||root.data==-1||((root.left==null||root.left.data==-1)&&(root.right==null||root.right.data==-1)))
        return;
        if(root.right==null||root.right.data==-1)
        rightboundary(root.right);
        else
        rightboundary(root.left);
        nodes.add(root.data);
    }
    public void leaves(BoundaryOfBTNode root)
    {
        if(root==null||root.data==-1)
        return;
        if((root.left==null||root.left.data==-1)&&(root.right==null||root.right.data==-1))
        {
            nodes.add(root.data);
            return;
        }
        leaves(root.left);
        leaves(root.right);
    }
    
}


