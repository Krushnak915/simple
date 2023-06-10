package assignment3;

public class emploe {
	String name;
	int year;
	String Adress;

	public String getInfo(){

	return (name +"\t "+year+ "  \t" + Adress);
	}
	public static void main(String[] args) {
	System.out.println("name   joining year   Adress");				
	
	emploe sc=new emploe();
	sc.name="Robert|";
	sc.year=1994;
	sc.Adress="  | 64c-Walls";
	emploe sk=new emploe();
	sk.name="sam   |";
	sk.year=2000;
	sk.Adress="  |  68d-Walls";
	emploe kk=new emploe();
	kk.name="john  |";
	kk.year=1999;
	kk.Adress="  |  26d-Walls";
	System.out.println(sc.getInfo());
	System.out.println(sk.getInfo());
	System.out.println(kk.getInfo());

}}