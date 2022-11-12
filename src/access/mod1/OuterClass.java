package access.mod1;

 public class OuterClass {
	 
	 private class InnerClass {		 
		public String name= "Aishwarya";
	 }
	 
	 public String name = "Sid";
	
	 public void printName() {
		System.out.println("Pramod");
	}
	 
	public String getName() {
		return name;
	}
	
	public void printname() {
		printName();
	}
	
	public void changeName(String newName) {
		name = newName;
		System.out.println(name);
	}

	public static void main(String[] args) {	
		OuterClass obj = new OuterClass();
		System.out.println(obj.name);
		obj.printName();		
		System.out.println(obj.new InnerClass().name);
	}

}
