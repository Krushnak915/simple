package assignment3;
public class Aranper{
int s1=3;
int s2=4;
int s3=5;
public static void main(String[] args)
  {
         Aranper t1=new Aranper();
         int peri=(t1.s1+t1.s2+t1.s3);
         System.out.println("perimeter is:"+peri);
         int sp=(peri/2);
         int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
         int area=(int)Math.sqrt(ar);   
         System.out.println("Area is:"+area);
  }
}