package arraycource;

public class oddevarray {

	public static void main(String[] args) {
System.out.println("even  element in array");
		int []a=new int[] {25,11,36,22,98,57};
        for(int i=0;i<a.length;i++) {
        	if(a[i]%2==0) {
        		System.out.println(a[i]);
        	}
        }
        System.out.println("odd element in array");
		 for(int i=0;i<a.length;i++) {
        	if(a[i]%2==1) {
        		System.out.println(a[i]);
        	}
        }

	}

}
