package arraycource;

public class countarray {

	public static void main(String[] args) {
		int [] a = new int [] {25, 11, 7, 75, 56};              	           
		
		System.out.println(a.length+" element present in this araay ");
//---------the sum of all element-------------------------

	int sum=0;
		for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
	}
		System.out.println("the sum of all element "+sum);
//---------------------------------------------------
		System.out.println("odd ");
		for(int i=0;i<a.length;i++) {
	if(a[i]%2==1) {
	System.out.println(+a[i]);
	}else{System.out.println("even "+a[i]);
	}}
//--------right rotate element--------------------
	int x[]= {1,2,3,4,3,6,2,8};
	 int n = 3;    
     System.out.println("Original array: ");    
     for (int i = 0; i < x.length; i++) {     
         System.out.print(x[i] + " ");     
     }      
         for(int i = 0; i < n; i++){    
         int j, last;    
         last = x[x.length-1];    
         for(j = x.length-1; j > 0; j--){    
             x[j] = x[j-1];    
         }
         x[0] = last;    
     }    
     System.out.println();    
         
     System.out.println("Array after right rotation: ");    
     for(int i = 0; i< x.length; i++){    
         System.out.print(x[i] + " ");    
     }  
}
	 }

