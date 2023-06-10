package Encapsulation;

public class encapsulation {
	public static void main (String []args) {
	 
    encapsule kk=new encapsule();  
      
    kk.setAcc_no(7560504000L);  
    kk.setName("krish \n");  
    kk.setEmail("krish777@gmail.com \n");  
    kk.setAmount(500000f);  
     
    System.out.println(kk.getAcc_no()+" \n"+kk.getName()+
    		" "+kk.getEmail()+" "+kk.getAmount());  
	}

}
