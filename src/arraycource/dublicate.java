package arraycource;

public class dublicate {
void dublicate(int a[]) {		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]=-1;
				count++;
			}
			}
		if(a[i]!=-1) {
			System.out.println(a[i]+"-"+count);
		}}	}
	  
		public static void main(String[] args) {
			int a[]= {1,2,3,4,2,4,1,1,5};
			dublicate kk=new dublicate();
			kk.dublicate(a);
	
}
}
