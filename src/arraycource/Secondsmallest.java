package arraycource;

import java.util.*;

public class Secondsmallest
{

public static int getSecondSmallest(int a[],int total) 
	{
	Arrays.sort(a);
	//return a[1];
	return a[2];
	}
	public static void main(String[] args) 
	{
int a[]= {1,4,2,5,3,6};
System.out.println("second smallest "+getSecondSmallest(a,6));
	}

}
