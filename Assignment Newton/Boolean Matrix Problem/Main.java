import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  int T;
                      System.out.println("Enter the Test Case");
					  T=sc.nextInt();
					  while(T>0)
					  {
						  int m=0,n=0;
                          System.out.println("Enter the rows of "+T);
						   m=sc.nextInt();
						   n=sc.nextInt();
						  int[][] arr=new int[m][n];
						  for(int i=0;i<arr.length;i++)
						  {
							  for(int j=0;j<arr[0].length;j++)
							  {
								  arr[i][j]=sc.nextInt();
							  }
						  }
						  for(int i=0;i<arr.length;i++)
						  {
							  for(int j=0;j<arr[0].length;j++)
							  {
								  if(arr[i][j]==1){
									  fill(arr,i);
									  break;
								  }
							  }
						  }
						  printArr(arr);
                          T--;
					  }
	}
	public static int[][] fill(int[][] arr,int i)
	{
	for(int j=i;j<=i;j++){
		for(int k=0;k<arr[0].length;k++){
			arr[j][k]=1;
		}
	}
	return arr;
	}
	public static void printArr(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}