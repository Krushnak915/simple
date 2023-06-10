package Polymorph;

public class Overload4 {
	public void disp(char c, int num)
	   {
	       System.out.println("the first method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("the second method disp" );
	   }
	
	
	   public static void main(String args[])
	   {
	    Overload4 obj = new Overload4();
	       obj.disp('x', 51 );
	       obj.disp(52, 'y');
	   }
	}

