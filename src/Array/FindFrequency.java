package Array;

public class FindFrequency {

	public static void main(String[] args) {
int a[]= {1,2,5,2,5,3,8,3,6,9};
		
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
		}	
		}
}
	}