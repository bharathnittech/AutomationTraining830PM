package language.basics;

public class DifferentTypesOfVariables {

	String name1 = "Dhruv";  //Instance Variable --> with obj only

	static String name2 = "Sid";  //Global/Static variable  --> with out obkject

	public void storeName() {
		String name3 = "Pramod"; //Local Variable 
	}

	public static void main(String[] args) {
		System.out.println(new DifferentTypesOfVariables().name1);
		System.out.println(name2);
	}

}
