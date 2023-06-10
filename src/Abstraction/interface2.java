package Abstraction;
interface Drawable{  
void draw();  
}  
  
class Rectangle implements Drawable{  
public void draw(){
	System.out.println("drawing rectangle");
	}  
}  
class Circle implements Drawable{  
public void draw(){   
	 System.out.println("drawing circle");
	 }  
}  
class interface2{  
public static void main(String args[]){  
Drawable d=new Circle();  
Drawable d2=new Rectangle(); 
d.draw();  
d2.draw();
}
}