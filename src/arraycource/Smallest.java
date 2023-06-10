package arraycource;
import java.util.*;

public class Smallest {
	public static int getSmallest(int[] a, int total){  
	Arrays.sort(a);  
	return a[0];  
	}  
	public static void main(String args[]){  
	int a[]={1,2,5,6,3,2};
	for(int i=0;i<=a.length-1;i++) {
	System.out.print(a[i]+" ");}
	System.out.println();
	
	System.out.println("Smallest: "+getSmallest(a,6)); 	
		}
	}


