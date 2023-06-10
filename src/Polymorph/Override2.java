
package Polymorph;
class overide1 {
	 void show(){
   System.out.println("Got 1st data.");
}
	 }
public class Override2 extends overide1{
 void show(){
   System.out.println("Got 2nd data.");
}

public static void main(String[] args) {
overide1 nm=new overide1();	
nm.show();
Override2 mn =new Override2();
mn.show();
}
}



