package Forloop;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
//	int i=1,n;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter eny number");
//	n=sc.nextInt();
//System.out.println("table is");
//		
//	do {
//		System.out.println(n*i);
//			i++;
//			
//	}while(i<=10); 
//	------------------------------------------

        int x = 15, sum = 0;
  
        do {
            sum += x;
            x--;
  
        } while (x > 10);
        System.out.println("Summation: " + sum);
    }
	}


