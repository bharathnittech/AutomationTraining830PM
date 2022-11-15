package language.basics;

public class NoException {

	public static void main(String[] args) throws Exception {

		int age = 17;

		if (age < 18) {
			throw new Exception("Not Eligible to Vote");
		} else {
			System.out.println("Eligible to Vote");
		}
		System.out.println("Execution Completed");
	}

}
