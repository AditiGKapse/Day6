package staticBlock;

public class MyClass {

	private int section;  
	
	private static int srNo; 
	
	//static block 
	static
	{
		System.out.println("-----------Within static block -----------");
		srNo=1000;
	}
	
	//default constructor 
	MyClass()
	{
		System.out.println("------------Within Default COnstructor----------");
		srNo++;  
		section++;  
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method 
	static void display()
	{
	
		System.out.println("Serail No : "+ srNo);
	
	
	}
}
