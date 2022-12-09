import java.util.*;


    //Structure of BinaryTreeNode for your reference.

    class BinaryTreeNode{
    	public int data; 
    	public BinaryTreeNode left, right; 
    	public BinaryTreeNode(int data){
    		this.data = data; 
    		left = null; 
    		right = null; 
    	}
    }
class BTAvg {
    public List<Double> averageOfLevels(BinaryTreeNode root) {
        //Implement your code here.
        Queue<BinaryTreeNode>q=new LinkedList<>();
        List<Double>l=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            double sum=0;
            for(int i=0;i<size;i++){
                BinaryTreeNode p=q.poll();
                if(p.left!=null && p.left.data!=-1){
                    q.offer(p.left);
                }
                if(p.right!=null && p.right.data!=-1){
                    q.offer(p.right);
                }
                sum+=p.data;
            }
            l.add(sum/size);
        }
        return l;
    }
}