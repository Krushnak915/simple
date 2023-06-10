package Polymorph;

public class Overload {
void show(int a,int b) {
	System.out.println("hi!!!");	
}
void show(int a) 
{
	System.out.println("Hello!!!!");
	}
public static void main (String []args) {
	Overload kk=new Overload();
	kk.show(10,20);
}
}
