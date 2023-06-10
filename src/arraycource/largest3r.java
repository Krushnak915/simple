package arraycource;
import java.util.*;
public class largest3r 
{
public static int getThirdLargest(int []a,int total) 
	{	
	Arrays.sort(a);
	//return a[total-3];
    return a[total-2];
	}
	public static void main(String[] args) {		
	int a[]= {1,6,3,4,8,5,2};
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	
	}System.out.println();
	System.out.println("third largest "+getThirdLargest(a,7));
	
	}
}
