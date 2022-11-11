package access.mod1;

 public class Class1 {
	
	 public String name = "Sid";
	
	 public void printName() {
		System.out.println("Pramod");
	}

	public static void main(String[] args) {	
		Class1 obj = new Class1();
		System.out.println(obj.name);
		obj.printName();
	}

}
