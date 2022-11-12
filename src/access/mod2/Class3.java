package access.mod2;

import access.mod1.OuterClass;

// CHILD  extends PARENT
public class Class3 extends OuterClass {

	public static void main(String[] args) {	
		OuterClass obj = new OuterClass();
//		System.out.println(obj.name);
//		obj.printName();
		
		System.out.println(obj.getName());
		obj.printname();
		obj.changeName("Dhruv");
	}

}
