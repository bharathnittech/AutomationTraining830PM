package language.basics;

public class ObjectConcepts {
	
	
	//What is Object ? ==> New Instance of Class 
	//Syntax to create object ==>  new ClassName() 

	public static void main(String[] sid) {
		
		MethodsConcepts obj = new MethodsConcepts();  // constructor in java ==> the default method created by java itself while creating new class
		
		obj.printEmpDetails(123, "Pramod","50K");
		
		obj.main(sid);
	}

}
