package assignment3;
public class StudentD{
 int roll_no;
 int phoneno;
String adress;
  public static void main(String[] args)
  {
	  StudentD sam =new StudentD ();
	  StudentD john =new StudentD ();
	    
  sam.roll_no =12;
  sam.phoneno =654465465;
  sam.adress ="singapur";
  john.roll_no =12;
  john.phoneno =654989465;
  john.adress ="usa";
 System .out. println ("sam detail \nroll number "
  + sam.roll_no +"\nphone number "+ sam.phoneno +"\nadress is" +sam.adress);
 System .out.println ("john detail \nroll number\n"
  +john.roll_no + "\\nphone number"+john.phoneno+"\nadress is"+john.adress);
   }
}
