package project1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression {

	public static void main(String[] args) {
        
		String pattern = "[A-Za-z0-9]{6}";

		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher("Navieen1");
	


		System.out.println("Result is: " + matcher.matches());



		String pattern1= "[6789]{2}\\d{8}";
		Pattern p1 = Pattern.compile(pattern1);
		Matcher matcher1 = p1.matcher("7891234567");

		if(matcher1.matches()) {
			System.out.println("Mobile number is valid");

		}
		else {
			System.out.println("invalid Mobile Number");
		}



	}


}