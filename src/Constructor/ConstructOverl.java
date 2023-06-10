package Constructor;
//construct overloading
public class ConstructOverl {
	  int id;  
	    String name;  
	    int age;  
  
   	    public ConstructOverl(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
 
	    ConstructOverl(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    ConstructOverl s1 = new ConstructOverl(111,"Karan");  
	    ConstructOverl s2 = new ConstructOverl(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
	}


