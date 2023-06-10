package assignment3;

import java.util.Scanner;

public class Area {
int length,breadth;
public Area(int l,int b) {
	length=l;
	breadth=b;	
}
public int  getArea() {
	return length*breadth;
}
public static void main(String[]args) {
	int l,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	l=sc.nextInt();
	System.out.println("enter breadth");
	b=sc.nextInt();
	Area a=new Area(l,b);
	System.out.println("Area of triangle: "+a.getArea());
}
}
