package Object;

public class UseMethod {
String color;
int age;
void main(String s,int a) {
	color=s;
	age=a;
}
void display() {
	System.out.println(color+""+age);
}
	public static void main(String[] args) {
		UseMethod h1=new UseMethod();
		h1.main("black ",10);
		h1.display();
	}

}
