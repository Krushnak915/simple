package Thiskeyword;

public class ThisKeyword5 {
	ThisKeyword5 m1() 
	{
		return this;
	}	
	public static void main(String []args) 
	{
	ThisKeyword5 t=new ThisKeyword5();
	t.m1();
	}
}
