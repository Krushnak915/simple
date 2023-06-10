package arraycource;

public class Sparsematrix {

	public static void main(String[] args) {
		int rows, cols, size, count = 0;    
        
        int a[][] = {       
                        {4, 0, 0},    
                        {2, 5, 0},    
                        {0, 0, 6}    
                    };         
         rows = a.length;    
        cols = a[0].length;
        size = rows * cols;            
   for(int i = 0; i < rows; i++){    
   for(int j = 0; j < cols; j++){    
    if(a[i][j] == 0)    
   count++;    
   }    
   }       
  if(count > (size/2))    {
 System.out.println("sparse matrix");    
 }else {    
  System.out.println(" not a sparse matrix");
 }
 }	
}
