package arraycource;

public class minele {
public static void main(String[] args) {
int [] arr = new int [] {25, 11, 7, 75, 56};   
int min = arr[0];         
for (int i = 0; i < arr.length; i++) {  	       
if(arr[i] < min)           
min = arr[i];  
      } 
System.out.println(min+" is smallest  ");
   }
  }
