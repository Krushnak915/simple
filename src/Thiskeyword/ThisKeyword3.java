package Thiskeyword;

public class ThisKeyword3 {
	//this keyword is used to invoke current class constructor
		
			int i;
		ThisKeyword3() 
			{
			this(10);
			System.out.println("no argumet constructor");
			}
			ThisKeyword3(int a)
			{
				System.out.println("parameteirzed constructor");
			}
			public static void main(String[] args)
			{
		     ThisKeyword3 tk=new ThisKeyword3();
			}
}
