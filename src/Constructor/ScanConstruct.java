package Constructor;

import java.util.Scanner;

class Employee{
Scanner sc=new Scanner(System.in);
	String name;
	int age;
	int rollno;
	double Salary;

 public Employee(String name,int age,int rollno,double Salary) 
 {
	 System.out.println("entr name ");
String names=sc.nextLine();
System.out.println("enter age ");
int ages=sc.nextInt();
System.out.println("enter roll no ");
int rollno1=sc.nextInt();
System.out.println("enter  Salary ");
double Salarys=sc.nextDouble();
 System.out.println("\n name is "+names);
 System.out.println("age is "+ages);
 System.out.println("rolllno is "+rollno1);
 System.out.println("salary is"+Salarys);
 
 sc.close();
 } 
 }
public class ScanConstruct {
	public static void main(String[] args) {
Employee kk =new Employee(null, 0, 0, 0);}

}
