package StaricKey;
public class Static1 {
int a=10;
static int b=20;

static void show() {
System.out.println(b);
}

void display() {
	System.out.println(a+""+b);
}
public static void main(String[] args) {
	Static1 r=new Static1();
	r.display();
	show();
	}

}
