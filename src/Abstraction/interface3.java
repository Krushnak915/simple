package Abstraction;
interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank{  
public float rateOfInterest(){
	return 9.15f;}  
}  
class PNB implements Bank{  
public float rateOfInterest(){
	return 9.7f;}  
}  
public class interface3 {  
public static void main(String[] args){  
Bank b=new SBI();  
Bank b2=new PNB(); 
System.out.println("ROI: "+b.rateOfInterest());  
System.out.println("PNB: "+b2.rateOfInterest());  
}
}



