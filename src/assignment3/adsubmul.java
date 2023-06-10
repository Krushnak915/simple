package assignment3;

public class adsubmul {

	
		static  int sum(int a,int b) 
		{
			return a+b;
		}
	
	
	static  int sub(int a,int b) 
		{
			return a-b;
	}

	static  int multiply(int a,int b) 
		{
			return a*b;
		}

	public static void main(String[] args) {
		int r=sum(10,20);
		int k=sub(10,20);
		int p=multiply(10,20);
		System.out.println("the addition is " +r);
		System.out.println("the substraction is " +k);
		System.out.println("the multificaition is " +p);
	}

}
