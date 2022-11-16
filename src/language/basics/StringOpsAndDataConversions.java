package language.basics;

public class StringOpsAndDataConversions {

	public static void main(String[] args) {
		String value = "  Username : Admin | Password : admin123  ";
				
		//Get the total number of chars available with in the string 
		System.out.println("Total Chars in String : "+ value.length());
		
		//Get the char available in the 6th position
		System.out.println("Char @ 6th Position is : "+value.charAt(5));
		
		//Reverse a String
		for(int i=value.length()-1; i>=0; i--)
			System.out.print(value.charAt(i));
		System.out.println();
		
		//Remove unwanted spaces with in the String
		System.out.println(value);
		System.out.println(value.trim());
		
		//If you want to replace part of the String
		System.out.println(value.replace(" ", ""));
		
		//Usage of Regular Expressions
		String text = "BALANCE@account#123";
		//Remove Special Chars
		System.out.println(text.replaceAll("[!@#$%^&*()_-]", "").toUpperCase());
		//Remove Alphabets
		System.out.println(text.replaceAll("[a-zA-Z]", ""));
		//Remove Numbers
		System.out.println(text.replaceAll("[0-9]", ""));
		//Want to print number alone
		System.out.println(text.replaceAll("[a-zA-Z]", "").replaceAll("[!@#$%^&*()_-]", ""));	

		//Get Specific text FROM the String
		System.out.println(value.substring(13,18));
		System.out.println(value.substring(32,40));

		//Get Specific text FROM the dynamic String
		String [] temp = value.split(" ");
		System.out.println(temp[4]);
		System.out.println(temp[8]);
		
		//Join the String values
		String value1 = "Pra";
		String value2 = "mod";
		System.out.println(value1+value2);
		System.out.println(value1.concat(value2));
		
		//Compare two strings
		//equals() ==> exact match includes case of each char
		//equalsIgnoreCase() ==>exact match by excluding case of chars
		//contains() ==> whether value 1 contains value 2 or not 
		
		String name1="Bharath";
		String name2="bharath";
		String name3="Arat";
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.contains(name3));



	}

}
