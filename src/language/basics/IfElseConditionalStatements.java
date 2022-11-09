package language.basics;

public class IfElseConditionalStatements {

	public static void main(String[] args) {
		// Input ==> Salary
		// write a program to get final In hand salary based on Indian tax system
		// <=5L ==> 0% ; >5L && <=10 ==> 20% ; >10L && <1C ==> 30% , >1C ==> 40%

		int salary = 55343;
		double finalsalary = 0;

		if (salary <= 500000) {
			finalsalary = salary;
		} else if (salary > 500000 && salary <= 1000000) {
			finalsalary = salary - (salary * 0.2);
		} else if (salary > 1000000 && salary <= 10000000) {
			finalsalary = salary - (salary * 0.3);
		} else {
			finalsalary = salary - (salary * 0.4);
		}
	
		System.out.println(finalsalary);

	}

}
