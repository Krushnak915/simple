package Inheritance;
// single inheritence!!
class tig   {
// void eat() {
//System.out.println("i am eating");
//	}
//}
//public class Inheritk extends tig{
//	public static void main(String[] args) {
//		tig d=new tig();
//		d.eat();
//	
//	}
// overriding !!
		void eat() {
	System.out.println("1");
		}
	}
	public class Inheritk extends tig{
	void eat() 
	{
	System.out.println("2");	
		}
		public static void main(String[] args) {
			tig d=new Inheritk();
			d.eat();
			//Inheritk k=new Inheritk();
			//k.eat();
		}

	}


