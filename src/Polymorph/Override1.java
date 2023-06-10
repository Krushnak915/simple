package Polymorph;
class Vehicle
{
void run()
{
	System.out.println("Vehicle is running");}  
}  

public class Override1 extends Vehicle{  
	void run() {
		System.out.println("this is very fast");
	} 
	public static void main(String args[]){  
Vehicle ob = new Vehicle();		
Override1 obj = new Override1();  
		  obj.run();  
		  ob.run();
	}  
		} 
