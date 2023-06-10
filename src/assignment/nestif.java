package assignment;

public class nestif {

	public static void main(String[] args) {

	    int n1 = 10, n2 = 45, n3 = 35, largest;
	    if (n1 >= n2) {
	      if (n1 >= n3) {
	        largest = n1;
	      }

	      else {
	        largest = n3;
	      }
	    } else {
	      if (n2 >= n3) {
	        largest = n2;
	      }

	      else {
	        largest = n3;
	      }
	    }

	    System.out.println("Largest Number: " + largest);
	}

}
