package Inheritance;
//hirarchical inheritence
	class AI {
	void showp() {
	System.out.println("Krushna");
	}
	}
	class BI extends AI{
	void showq() {
	System.out.println("rahul");
	}
	}
	class KI extends AI {
	void showr() {
	System.out.println("vitthal");
	}
	public static void main(String[] args) {
	KI ob =new KI();
	ob.showp();
	   ob.showr();
	   BI ob1 =new BI();
		ob1.showp();
		  ob1.showq();
	   
	}
}



