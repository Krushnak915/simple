package Forloop;
//continue
public class Fo {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		if(i==3) {
			continue;
		}System.out.println(i);
	}
	
	
	System.out.println("-------------------------");
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			
		if(i==2 && j==3) {
			continue;
			}
		System.out.println(i+""+j);}
		}

	System.out.println("-------------------------");
	
         for(int i=10; i>1; i--){
     System.out.println("The value of i is: "+i);
         } 
   System.out.println("-------------------------");
         String arr[]={"hi","hello","bye"};
         for (String str : arr) {
                  System.out.println(str);
         }       
    }

	
}
