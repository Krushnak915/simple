package Polymorph;
class Overload2 {

void showk(int a )
{
    System.out.println("Parent's show()");
}

void show()
{
    System.out.println("Child's show()");
}


public static void main(String []args) {
	Overload2 ob= new Overload2();
	ob.showk(5);	
    ob.show();
}
}
