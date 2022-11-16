package keywords.pack;

public class KeyClass2 extends KeyClass1 {
	
	String name="Pramod";
	
	public void printName(String name) {
		System.out.println(name);
		System.out.println(this.name);//new KeyClass2()
		System.out.println(super.name);//new KeyClass1()
		System.out.println(Directions.NORTH);
		System.out.println(Priority.MEDIUM);
	
	}

	public static void main(String[] args) {
		new KeyClass2().printName("Sid");
	}

}
