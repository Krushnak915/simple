package Abstraction;
abstract class Shape{  
abstract void draw();  
}  
  
class mirr extends Shape{  
void draw(){
	System.out.println("drawing rectangle");
	}  
}  
class Circle1 extends Shape{  
void draw(){
	System.out.println("drawing circle");
	}  
}  
public class Abstract3 {
		public static void main(String args[]){  
			Shape s=new Circle1();  
			s.draw();
			Shape s2=new mirr();  
			s2.draw();

		}
}
