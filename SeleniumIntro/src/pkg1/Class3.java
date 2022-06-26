package pkg1;

// constructor is like a method
// constructor name and class name will be same
// no return type
// no need to call,it will be called by itself
// as we create the object of the class

public class Class3
{
	final int a=2344;
  public Class3() // 
  {
	System.out.println("Default constructor");
  }
  
  public Class3(int a) // 
  {
	  this(112,22); // it will call two parameterized constructor
	  System.out.println("one parameterized constructor");
  }
  
  public Class3(int a,int b) // 
  {
	  this(); // it will call default constructor
	System.out.println("two parameterized constructor");
  }
  public void metgod1()
  {
	  
  }
  public static void main(String[] args)
  {
	Class3 ref=new Class3(233); // control will go to one parameterized
    ref.a=23444;
  
  }
	
}
