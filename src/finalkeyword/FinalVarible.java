package finalkeyword;

public class FinalVarible {
	
	final int x=100;
	
	final static int y;
	
	final static int z = 10;
	
	//instance method 
	void change() {
//		x=30; //final varibles can't be reassigned 
//		y=200; //final static varibles can't be reassigned 
	}

	@Override
	public String toString() {
		return "FinalVarible [x=" + x + ", y=" + y +"]";
	}
	static {
		y=20;
		System.out.println("Value of Y :" + y);
	}
	
	
	
	
	
	
	
}
