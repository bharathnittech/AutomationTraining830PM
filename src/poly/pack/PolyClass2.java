package poly.pack;

public class PolyClass2 extends PolyClass1 {
	
	public void sumOfNumbers() {
		System.out.println("No value");
	}
	
	public void sumOfNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sumOfNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
		new PolyClass2().sumOfNumbers();

	}

}
