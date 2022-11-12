package abs.pack;


//100% Abstract Class

public interface IntfClass {	

	public abstract void printName(); 
	
	public void printName2();
	
	default void getDarkTheme() {  // non-mandatory abstract method
		//no code
	}
	
	public static void printName3() { 
		System.out.println("Dhruv");
	}

}
