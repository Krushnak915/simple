package arraycource;

import java.util.Arrays;

public class Removeduplicate {

	public static void main(String[] args) {
	int a[]= {1,2,4,6,3,2,2,6,5,2,7,9};
	int temp[]= new int[a.length];
	int j=0;
	Arrays.sort(a);
	System.out.println("the sorted original arrays ");
	
	for (int i=0;i<a.length-1;i++) {
		System.out.print(a[i]+" ");}
	System.out.println();
	
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			temp[j]=a[i];
		j++;
		 }
	}
	System.out.println();
	temp[j]=a[a.length-1];
	
	System.out.println("removing arrays element ");
	for(int i=0;i<a.length;i++) {
		System.out.print(temp[i]+" ");
	}
	}

}
