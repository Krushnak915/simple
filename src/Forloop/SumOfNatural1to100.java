package Forloop;

public class SumOfNatural1to100 {
	 public static void main(String[] args) {
	      
		    int sum = 0,sum2=1;
		    int n = 1000;

		    for (int i = 1; i <= n; ++i) {
		      sum += i;     
		    }System.out.println("Sum = " + sum);

		    for (int i = 1000; i >= 1; --i) {
			      sum2 -= i;     
			    }   
		    System.out.println(sum2);	  
	 }
		}



