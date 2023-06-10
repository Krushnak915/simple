package arraycource;

public class Add2Array {

	public static void main(String[] args) {
	int a[]= {1,5,3,6,9,7,5,2};
	int b[]= {9,8,5,6,3,2,4,1};
	int c[]=new int[a.length];
	for(int i=0;i<b.length;i++) {
		
	
	c[i]=a[i]+b[i];
	System.out.println(c[i]+" ");
	}
	}
}
