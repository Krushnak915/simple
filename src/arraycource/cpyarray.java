package arraycource;

public class cpyarray {

	public static void main(String[] args) {

		int []a=new int[] {25,11,36,22,98};
        int []a2=new int[a.length];
        for(int i=0;i<a.length;i++) {
        	a2[i]=a[i];
        }
		System.out.println("the original array");	
	    for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");			
}System.out.println();
		
		System.out.println("copied array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a2[i]+" ");
		}
		}
        }
