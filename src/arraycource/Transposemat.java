package arraycource;

public class Transposemat {

	public static void main(String[] args) {
		int original[][]={{1,3,5},{2,4,6},{3,2,5}};    
		int transpose[][]=new int[3][3];   
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=original[j][i];  
		}    
		}    
		  
	System.out.println(" Matrix without transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(original[i][j]+" ");    
		}    
		System.out.println();    
		}   
		System.out.println(" Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();  
		}    
		}}



