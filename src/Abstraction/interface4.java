package Abstraction;
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
public class interface4 implements Printable,Showable{  
public void print(){
	System.out.println("Hello");
	}  
public void show(){
	System.out.println("Welcome");
	}  
  
public static void main(String args[]){  
interface4 obj = new interface4();  
obj.print();  
obj.show();  
 }  
}



