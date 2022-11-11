package language.basics;

public class MethodsConcepts {



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
		
		MethodsConcepts dhruv = new MethodsConcepts(); 
		
		dhruv.printEmpDetails(123, "Pramod","50K");
		dhruv.printEmpDetails(124, "Dhruv","60K");
		dhruv.printEmpDetails(125, "Aishwarya","70K");
		
		System.out.println(dhruv.sumOfNumbers(50,70)*100);
		

	}

	//Method to print emp details
	 void printEmpDetails(int empid, String empName, String empSalary) {
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(empSalary);
	}

	//Method to print sum of 10 and 20 with return type
	 int sumOfNumbers() {
		int a = 10;
		int b = 20;
		return a + b;
	}

	//Method to get sum of any 2 numbers
	int sumOfNumbers(int a, int b) {
		return a + b;
	}

}
