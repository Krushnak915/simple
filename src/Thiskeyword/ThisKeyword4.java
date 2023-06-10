package Thiskeyword;

public class ThisKeyword4 {
	//this keyword is used to argu in method call
	
		int i;
		void m1(ThisKeyword4 tk) 
		{
		System.out.println("m1 is method ");
		}
		void m2()
		{
		m1(this);
		System.out.println("hello Friends");
		}
	   public static void main(String[] args)
		{
	    ThisKeyword4 tk=new ThisKeyword4();
	    tk.m2();
		}
}
