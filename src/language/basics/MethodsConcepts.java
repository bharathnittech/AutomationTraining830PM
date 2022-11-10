package language.basics;

public class MethodsConcepts {
	
	MethodsConcepts(){
		
	}
	
	MethodsConcepts(int value){
		
	}
	
	MethodsConcepts(String value){
		
	}


	// Method means ==> Set of Statements / Collection of Statements / Block of code
	// Purpose ==> To reduce duplicate code

	public static void main(String[] args) {

		// Print employee details
//		System.out.println(123);
//		System.out.println("Pramod");
//		System.out.println("50K");
//
//		System.out.println(124);
//		System.out.println("Dhruv");
//		System.out.println("60K");
//
//		System.out.println(125);
//		System.out.println("Aishwarya");
//		System.out.println("70K");
		
		MethodsConcepts obj = new MethodsConcepts(); 
		
		obj.printEmpDetails(123, "Pramod","50K");
		obj.printEmpDetails(124, "Dhruv","60K");
		obj.printEmpDetails(125, "Aishwarya","70K");
		
		System.out.println(obj.sumOfNumbers(50,70)*100);

	}

	void printEmpDetails(int empid, String empName, String empSalary) {
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(empSalary);

	}

	int sumOfNumbers() {
		int a = 10;
		int b = 20;
		return a + b;
	}

	int sumOfNumbers(int a, int b) {
		return a + b;
	}

}
