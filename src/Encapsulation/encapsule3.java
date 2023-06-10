package Encapsulation;

class Person {
  private int age;
private String name;

  public int getAge() {
    return age;
  }

  public void setAge(String name,int age) {
	  this.setName(name);
    this.age =age ;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}

public class encapsule3 {
  public static void main(String[] args) {

    Person p1 = new Person();


    p1.setAge("krish",24);
    System.out.println("my name " +p1.getName()+" and age is " + p1.getAge());
  }
}
