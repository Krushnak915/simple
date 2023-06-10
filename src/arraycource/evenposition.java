package arraycource;
import java.util.Scanner;
public class evenposition {

	public static void main(String[] args) {
//	int a[]= {1,2,3,4,5,6,4,8};
//	System.out.println("odd number array");
//	for(int i=0;i<a.length;i=i+2) //odd
//		System.out.print(a[i]+" ");
//	
//	System.out.println();
//	System.out.println("even number array");
//		for(int j=1;j<a.length;j=j+2)
//	{
//		System.out.print(a[j]+" ");
//	}
		int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter number: ");  
n=sc.nextInt();  
int[] array = new int[n];  

System.out.println("Enter elements array: ");  
for(int i=0; i<n; i++)  
{  

	array[i]=sc.nextInt();  
}

System.out.println("odd position array");
for(int i=0;i<array.length;i=i+2) //odd
	System.out.print(array[i]+" ");

System.out.println();

System.out.println("even position array");

for(int j=1;j<array.length;j=j+2)
{
System.out.print(array[j]+" ");
}System.out.println(" ");
	}
}
