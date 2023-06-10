package Polymorph;
//promotion
public class Overload5 {
 void disp(int a, double b){
System.out.println("Method A");
  }
 void disp(int a, double b, double c){
 System.out.println("Method B");
   }
  public static void main(String args[]){
  Overload5 obj = new Overload5();

			obj.disp(100, 20.67f);
		   }
		}

