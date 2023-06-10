package Forloop;
import java.util.Scanner;
public class DoWhileEven {

	public static void main(String[] args) {
	 Scanner co = new Scanner(System.in);
	     
	        int n;
	        char ch;
	        int eS = 0;
	        int oS = 0;
	        
	        do
	        {
    System.out.print("Enter the number ");
    n = co.nextInt();
    if( n % 2 == 0)
      {
       eS += n;
      }
   else
   {
       oS += n;
      }
     
 System.out.print("Do you want to continue y/n? ");
  ch = co.next().charAt(0);
      
   }while(ch=='y' || ch == 'Y');
   
   System.out.println("Sum of even numbers: " + eS);
  System.out.println("Sum of odd numbers: " + oS);
   
}

}
