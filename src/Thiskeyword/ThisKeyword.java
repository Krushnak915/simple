package Thiskeyword;
//this keyword is used to invoke current class(instance variable)
public class ThisKeyword {
int i;
	void setValue(int i) 
	{
		this.i=i;
	}
	void show() 
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
     ThisKeyword tk=new ThisKeyword();
     tk.setValue(100);
     tk.show();


}
}

