/*
Akbar used to play chess with Birbal almost every evening.
Once Akbar has challanged Birbal to place the queens in each row of the board,
such that no queen should attack another queen on the board.

You are given an integer N, indicates the size of the board as N*N.
Your task is to help Birbal to find and win in this challange, 
if there is a solution, print the answer as shown in the samples
Otherwise, print "No Solution"

Input Format:
-------------
An integer N, size of the chess board.

Output Format:
--------------
Print any possible solution.


Sample Input-1:
---------------
4

Sample Output-1:
----------------
0010
1000
0001
0100



Sample Input-2:
---------------
3

Sample Output-2:
----------------
No Solution

 */
import java.util.*;
class nqueen{
    int N;
    int x[]=new int[20];
	ArrayList<String> res=new ArrayList<>();
    public boolean check(int k,int i){
        for(int j=1;j<=k-1;j++){
            if(x[j]==i || Math.abs(x[j]-i)==Math.abs(k-j)){
                return false;
            }
        }
        return true;
    }
    public void nqueens(int k,int n,ArrayList<String> res){
        for(int i=1;i<=n;i++){
            if(check(k,i)){
                x[k]=i;
                int l=1;
                if(k==n){
                    for( l=1;l<=n;l++){
                        String s="";
                        for(int j=1;j<=n;j++){
                            if(x[l]==j){
                                s+='1';
                            }
                            else{
                                s+='0';
                            }
                        }
                        res.add(s);
                    }
                }
                else{
                    nqueens(k+1,n,res);
                }
            }
        }
    }
    public void solveNQ()
	{
	    nqueens(1,N,res);
	    if(res.size()>0){
	        int c=0;
	        for(String s:res){
	            System.out.println(s);
	            c++;
	            if(c==N){
	                break;
	            }
	        }
	    }
	    else{
	        System.out.println("No Solution");
	    }
        //implement your logic here.
	}
}