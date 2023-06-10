package ControlStatement;

public class IfElseLadder {

	public static void main(String[] args) {
	int marks=96;
	if(marks<35) 
		System.out.println("fail");
	 else if(35<=marks&& marks<=50) 
	System.out.println("c grade ");
	
	 else if(marks>=50&&marks<=70) 
	System.out.println("b grade");
	else if(marks>=70&&marks<=90 )
System.out.println("a grade ");
	else if (marks>=90 && marks<100) 
		System.out.println("o grade");
	else
		System.out.println("invalid");
}
}