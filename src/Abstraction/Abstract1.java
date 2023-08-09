package Abstraction;
abstract class Animal{
	public abstract void animalSound();
      static int a=20;
      static int b=30;
	public void sleep() {
		System.out.println("zzzz");
	}
}
class cat extends Animal{
 public void animalSound() {
		System.out.println(a+b);
		System.out.println("the cat says :mau mau asdasdf");

 }
}
public class Abstract1 {
public static void main(String []args) {
cat jk=new cat(); 
jk.animalSound();
jk.sleep();
}
}
