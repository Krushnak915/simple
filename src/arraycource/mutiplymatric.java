package arraycource;

public class mutiplymatric {

	public static void main(String[] args) {
		int arr[][]= {{1,5,9},{2,5,8},{4,5,6}};
		int arr2[][]= {{3,5,7},{1,2,3},{3,6,9}};
		int c[][]=new int[3][3]; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
			
			c[i][j]=arr[i][j]*arr2[i][j];
		System.out.print(c[i][j]+" ");
			}  
		System.out.println( );
		
	}
	}

}
