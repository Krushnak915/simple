package Constructor;

public class NorgConstruct {
	  int id;  
	    String name;  
	    
	    public NorgConstruct(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	     
	    NorgConstruct s1 = new NorgConstruct(111,"Karan");  
	    NorgConstruct s2 = new NorgConstruct(222,"Arjun");  
	      
	    s1.display();  
	    s2.display();  
	   }  
	} 
	


