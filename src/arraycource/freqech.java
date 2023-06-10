package arraycource;

public class freqech {
	public static void main(String[] args) {
/*	//--------show only 2  duplicate element
		int []a={2,1,3,1,3,6,2};		
        for(int i=0;i<a.length-1;i++) 
        {
        	for(int j=i+1;j<a.length;j++) 
        	{
        		if((a[i]==a[j])&&(i!=j)){
      System.out.print(a[j]+" ");
        		}
        		}
        }*/
//--------frequency----------------
    /*int a[]=new int[] {1,2,3,5,2,4,2,4};
  //  int freq[]=new int[a.length];
    int counter=0;
    int visit=-1;
    for(int i=0;i<a.length;i++)
    {
        int count=1;
        for(int j=i+1;j<a.length;j++)
        {
            if(j>=i){
            	if(a[i]==a[j]&&i!=j) {
            count++;}}
            	else if(a[i]==a[j]) {
           visit=1;
         break;   }
        }
        if(visit!=1) {    
    System.out.println("element "+a[i]+" repeated "+count+" times");
      }
    } */     
//---------left rotate array-----------
    int x[]= {1,2,3,4,3,6,2,8};
    System.out.println("input array");
    for(int i=0;i<x.length;i++) 
    {
    	System.out.print(x[i]+" ");
    }
    int first=x[0];
    for(int j=0;j<x.length-1;j++) {
    	x[j]=x[j+1];
    	}
    	x[x.length-1]=first;
    System.out.println();
    System.out.println("output array:");
    for(int i=0;i<x.length;i++) {
    System.out.print(x[i]+" ");
    }
//-------------frequency array--------------------------------
	/*int arr[]= {1,2,3,4,1,2,6,9,2,3,9};
	for(int i=0;i<arr.length-1;i++) 
	{
		int count=1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			arr[j]=-1;
			count++;
		}
			
		}
	if(arr[i]!=-1) {
		System.out.println(arr[i]+"-"+count);
	}
		}*/
//---------------print in length array-------
		/*int a[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=a.length;i++) {
		System.out.println(a[i]);
		}		
*/		}
		}

	
