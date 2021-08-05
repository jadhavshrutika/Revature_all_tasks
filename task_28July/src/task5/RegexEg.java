package task5;

public class RegexEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//The username consist of more than 8 characters and 30
		//the first character must be capitalized.
		//At must have one special char
		
//		8
//		Julia
//		Samantha
//		Samantha_21
//		1Samantha
//		Samantha?10_2A
//		JuliaZ007
//		Julia@007
//		_Julia007
		
		//(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}
		
//		(?=.*[0-9]) a digit must occur at least once
//		(?=.*[a-z]) a lower case letter must occur at least once
//		(?=.*[A-Z]) an upper case letter must occur at least once
//		(?=.*[@#$%^&+=]) a special character must occur at least once
//		(?=\\S+$) no whitespace allowed in the entire string
//		.{8,} at least 8 characters//return 

		
		String str = "J@uliaZ007";
		if(str.length()>=8 && str.length()<=30) {
			if(str.matches("([A-Z]*[a-z]*.[0-9]*)")) {
				System.out.println("valid");
			}else {
				System.out.println("Invalid");
			}
		}
	}

	
	
}


