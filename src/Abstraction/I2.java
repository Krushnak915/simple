package Abstraction;
interface I1{
	void show();
}
interface I3{
	void display();
	}
class I2 implements I1,I3{
public void show() {
	System.out.println("1");
}
public void display() {
	System.out.println("2");
}
public static void main(String [] args) {
I2 kk=new I2();
kk.show();
kk.display();
}
}
