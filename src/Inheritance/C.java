package Inheritance;
//import assignment.*;
//multilevel inheritence
class A {
	//class C
	void showA() {
	System.out.println("A class method");
	}
	}
	class B extends A {
	void showB() {
	System.out.println("B class method");
	}
	}
	 class C extends B {
	void showc() {
	System.out.println("C class method");
	}
	public static void main(String[] args) {
	C ob =new C();
	ob.showA();
ob.showc();
    ob.showB();
//Inheritk.main(null);    
	 }
}
