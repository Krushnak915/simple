package Methods;

public class Predefined {

//	static int  add(int a,int b) {
//		return a+b;
//	}
//	public static void main(String[] args) {

//System.out.println(add(25, 20));
//=====================================================
//predefined max
	//System.out.print("The maximum number is: " + Math.max(1,6));  		  	 
//===================================================

/*
			  // addition in method 
  public int addNumbers(int a, int b) {
  int sum = a + b;
  return sum;
  }
 public static void main(String[] args) {
    
   int num1 = 25;
   int num2 = 15;
 Predefined obj = new Predefined();
  int result = obj.addNumbers(num1, num2);
   System.out.println("Sum is: " + result);
*/	
//==========SQURE of 1-5 number =========================
	private static int getSquare(int x){
    return x * x;
	  }
public static void main(String[] args) {
 for (int i = 1; i <= 5; i++) {
 int result = getSquare(i);
  System.out.println("Square of " + i + " is: " + result);
//======================================================    
}
}}