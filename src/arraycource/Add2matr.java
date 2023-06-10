package arraycource;
public class Add2matr {

	public static void main(String[] args) {
		int arr[][]= {{1,5,9},{2,5,8},{4,5,6}};
		int arr2[][]= {{3,5,7},{1,2,3},{3,6,9}};
		//2-3 D array addition
		//int arr[][]={{1,2,3},{9,8,7,}};
		//int arr2[][]={{4,5,6},{1,4,7}}
		//int c[][]=new int[2][3]; 
		
		int c[][]=new int[3][3]; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
			//for(int j=0;j<=arr2.length;i++){
			c[i][j]=arr[i][j]+arr2[i][j];
		System.out.print(c[i][j]+" ");
			}  
		System.out.println( );
		
	}}
 }
