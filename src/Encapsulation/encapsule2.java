package Encapsulation;

 class Main {
	  int length;
	  int breadth;

	  Main(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	
//	  public void getAreak() {
//	    int area = length * breadth;
//	    System.out.println("Area: " + area);
//	  }
	
 public int  setAreak() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
return 0;	  
 }
	}

 
class encapsule2 {
	
	
	  public static void main(String[] args) {
	    Main rect = new Main(5, 6);
	    rect.setAreak();
	  }
	  
	}


