package SortingAlgorithms;

public class SelecionSorting {

	public static void main(String[] args) {
	int a[]= {6,4,3,1,5,2};
	int temp=0,min;
	for(int i=0;i<a.length;i++) {
		min=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[min]) {
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]+"");
}
	}

}
