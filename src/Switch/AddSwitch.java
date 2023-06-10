package Switch;
import java.util.Scanner;
public class AddSwitch {

	public static void main(String[] args) {
		Scanner kk=new Scanner(System.in);
System.out.println("enter no 1: ");
		int a=kk.nextInt();
System.out.println("enter no 2: ");
int  b=kk.nextInt();
char c=kk.next().charAt(0);
	switch(c)
	{
	case '+':
System.out.println(a+b);
break;
case '-':
System.out.println(a-b);
break;case '*':
System.out.println(a*b);
break;
case '/':
System.out.println(a/b);
break;
case '%':
System.out.println(a%b);
	break;
default:
	System.out.println("invalid");
	break;
	}
	kk.close();
	}

}
