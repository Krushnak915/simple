package assignment3;

public class rectngle {
 int l1=4,b1=5,l2=5,b2=8;
public static void main(String[] args)
 {
 rectngle rect=new rectngle();
System.out.println(" 1 is :"+rect.Area(rect.l1,rect.b1));
System.out.println("2 is :"+rect.Area(rect.l2,rect.b2));
 }
 public int Area(int length,int breadth)
{
   return length*breadth;   
	}
	} 		




