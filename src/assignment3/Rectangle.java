package assignment3;
public class Rectangle 
{ 
    int length; 
    int breadth; 
 
   void setDim(int l, int b)
   { 

     length = l; 
     breadth = b; 
  } 
int getArea()
{ 
   int Aor = length * breadth; 
   System.out.println("Area of Rectangle:" +Aor); 
  return Aor;
} 
public static void main(String[] args)
 {
 
     Rectangle rt = new Rectangle(); 
     rt.setDim(21,32); 
     rt.getArea(); 
     
 }
}
