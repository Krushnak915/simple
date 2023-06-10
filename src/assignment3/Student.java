package assignment3;
public class Student {
String name;
int rollno;
void st_detail() {
	rollno=2;
	name= "john";
	System.out.println("full detail\n"+ rollno + name);
}
/*void st_det() {
	rollno=3;
	name= "sam";
	System.out.println("full detail\n"+ rollno + name);
}*/
	public static void kk(String[] args) {
	Student st=new Student();
	st.st_detail();
//	Student stu=new Student();
	//stu.st_det();

	}

}
