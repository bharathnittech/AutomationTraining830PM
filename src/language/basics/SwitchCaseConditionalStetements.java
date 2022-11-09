package language.basics;

public class SwitchCaseConditionalStetements {
	
	//When we are recruiting any employee for below roles , we have to print 
	
	// the employee role
	// employee salary 
	// eligible for shares
	
	//Fresher , Lead , Manager are roles 
	//Fresher ==> Salary = $20K, No Shares
	//Lead ==> Salary = $40K, 100 Shares
	//Manager ==> Salary = $60K, 200 Shares

	public static void main(String[] args) {
		
		String role = "Lead";
		
		switch(role) {
		
		case "Fresher":
			System.out.println(role);
			System.out.println("Salary is $20K");
			System.out.println("No Shares will be provided");
			break;
		case "Lead":
			System.out.println(role);
			System.out.println("Salary is $40K");
			System.out.println("100 Shares will be provided");
			break;
		case "Manager":
			System.out.println(role);
			System.out.println("Salary is $60K");
			System.out.println("200 Shares will be provided");
			break;
		case "Director":
			System.out.println(role);
			System.out.println("Salary is $80K");
			System.out.println("300 Shares will be provided");
			break;
		default:
			System.out.println("Invalid Role");
		}
		

	}

}
