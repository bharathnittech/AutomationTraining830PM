package language.basics;

public class Operators {

	public static void main(String[] args) {
		
		// 1. Arithmetic Operators ==> the symbols used in mathematical operations
		// 2. Assignment Operators
		// 3. Comparison Operators
		// 4. Logical Operators
		
		
		// 1. Arithmetic Operators ==> the symbols used in mathematical operations
		// + , - , * , / , % , ++ (+1), -- (-1)
		int i = 10;
		i++; // i= i+1 ;
		System.out.println(i);
		i--; //i=i-1
		System.out.println(i);
		
		// 2. Assignment Operators ==> to assign values to variable
		// = , +=, -=, *=, /= 
		int x = 10;
		
		x+=5; // x = x+5; 10+5 = 15 ;
		System.out.println(x);
		x-=10; // 15-10= 5
		System.out.println(x);
		x*=2;
		System.out.println(x);
		
		
		// 3. Comparison Operators ==> to compare numbers and chars we are using these operators
		// ==, !=, >=, <= , >, <
		
		int a = 10;
		int b = 20;
		
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a!=b);
		
		// 4. Logical Operators ==> to build logics by combining multiple conditions together 
		// && (and), || (or) , ! (not)
		// and ==> except true and true all other conditions are false
		// or ==> except false or false all other conditions are true
		// not ==> not true is false and not false is true
		
		System.out.println(!(a>b || a==b) && a<b);
		
		
	}

}
