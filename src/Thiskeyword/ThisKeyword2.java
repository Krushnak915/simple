package Thiskeyword;
//method 
public class ThisKeyword2 {
		
		int i;
		void display() 
		{
		System.out.println("Hello!!!");
		}
		void show()
		{
			this.display() ;	
			System.out.println("krushna");
		}
		public static void main(String[] args)
		{
	     ThisKeyword2 tk=new ThisKeyword2
	    		 ();
	     tk.show();    
		}
}
