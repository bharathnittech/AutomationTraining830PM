package language.basics;

import java.util.ArrayList;
import java.util.List;

public class LoopsConcepts {

	// Loops ==> the concept that we are going to use to execute the same code multiple times without duplicating the code
	
	//for loop  ==> when we know how many times we want to execute the code 
	//while loop ==>  when we don't know how many times we want to execute the code (or may be until some condition it satisfies)
	//do-while loop  ==> Always at least one time if you want to execute even when condition not satisfies 
	
	public static void main(String[] args) {
		
		String name = "pramod";
		
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
		
//		for (condition to start ; condition to stop ; condition to set the interval) {
			//code	
//		}
		
		for(int i=1 ;i<=100 ; i++) {
			System.out.println(i+"."+name);
		}
		
//		Key words will be used along with condition to control loops : 1. continue , 2.break
		
		//1. continue ==> skip the current iteration
		//2. break ==> break the loop
		
		for(int i=1 ;i<=10 ; i++) {
			
			if(i>5 && i<8) {
				break;
			}
			System.out.println(i);
		} 
		
	
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Pramod");
		empNamesArrayList.add("Aishwarya");
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Pramod");
		empNamesArrayList.add(null); // null meaning no value (literal) ==> getting memory from computer but not
										// storing any value
//		empNamesArrayList.remove("Amit");

		System.out.println(empNamesArrayList);
		
		for (String value : empNamesArrayList) {
			System.out.println(value);
		}

	}

}
