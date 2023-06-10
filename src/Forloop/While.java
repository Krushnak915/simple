package Forloop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
int v,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter integer 'enter '0' to quit'");
	v=sc.nextInt();
	while(v!=0) {
		s=s+v;
  //System.out.println("enter the integer'enter 0 to quit'");
  v=sc.nextInt();
	
	}
	sc.close();
	System.out.println("sum of all integer "+s);
	   }
	}


