/*
     1
    232
   34543
  4567654
 567898765
 */
class Output5
{
	public static void main(String[] args)
	{
		int sp=5,i,j,k;
		int ct=0;
		for(i=1;i<=5;i++){
		    for(k=1;k<=sp;k++){
		        System.out.print(" ");
		    }
		    for(j=1;j<=i;j++){
		        System.out.print(j+ct);
		    }
		    for(j=j-2;j>=1;j--){
		        System.out.print(j+ct);
		    }
		    sp--;
		    System.out.println();
		    ct++;
		}

		//logic
	}
}