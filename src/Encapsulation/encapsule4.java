package Encapsulation;
import java.util.*;
 class StudentMarks
	{
	 Scanner sc=new Scanner(System.in);
	 
		 private String name; 
		 private int phyMarks; 
		 private int chemMarks; 
		 private int bioMarks; 

		public void setName(String name)
		{ 
		 this.name = name; 
		}
		public void setPhyMarks(int phyMarks)
		{ 
		 this.phyMarks = phyMarks; 
		} 
		public void setChemMarks(int chemMarks)
		{ 
		 this.chemMarks = chemMarks; 
		} 
		public void setBioMarks(int bioMarks)
		{ 
		 this.bioMarks = bioMarks; 
		} 
		void marksRead() 
		{
			System.out.println("enter name");
			name=sc.nextLine();
			System.out.println("physics marks");
			phyMarks=sc.nextInt();
			System.out.println("chemistry marks");
			chemMarks=sc.nextInt();
			System.out.println("biology amrks");
			bioMarks=sc.nextInt();
		 System.out.println("Student's Name: " +name); 
		 System.out.println("Marks in Physics: " +phyMarks); 
		 System.out.println("Marks in Chemistry: " +chemMarks); 
		 System.out.println("Marks in Biology: " +bioMarks); 

		 int Totalmarks = phyMarks + chemMarks + bioMarks; 
		 float percentage = (Totalmarks * 100)/300; 
		System.out.println("Percentage of PCB: " +percentage); 
		 } 
		}
	 public  class  encapsule4 
		{ 
		public static void main(String[] args) 
		{ 
		 StudentMarks st = new StudentMarks(); 
		 st.setName(null); 
		 st.setPhyMarks(0); 
		 st.setChemMarks(0); 
		 st.setBioMarks(0); 
		 st.marksRead(); 
		 } 
}
