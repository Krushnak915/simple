package arraycource;
import java.util.Arrays;
public class sortasse {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,3,6,2,8};
//ASSENDING
Arrays.sort(arr);     
System.out.println("aseending");
for (int i = 0; i <=arr.length-1; i++) {
     System.out.print( arr[i]+" ");
	     }
System.out.println();
 	 //DESSENDING
		 int temp;
	     for(int i=0;i<arr.length;i++) {
	     for(int j=i+1;j<arr.length;j++) {
	     if(arr[i]<arr[j]) {
	    	 temp=arr[i];
	    	 arr[i]=arr[j];
	    	 arr[j]=temp;
	     }
	     }
	     }
	 	    System.out.println("descending"); 
	 	    for(int i=0;i<arr.length;i++) {
	    	System.out.print( arr[i]+" ");  
		 }
         }}