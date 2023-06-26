package application;

import java.util.Locale;

import services.BrazilInterestService;
import services.CanadaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("\nExample with brazilian interest rate (2.0% a month)");
		
		BrazilInterestService bis = new BrazilInterestService();
		double initialValue = 200;
		int months = 3;
		bis.payment(initialValue, months); // 212.24
		
		/////////////////////////////
		
System.out.println("\nExample with canadias interest rate (1.0% a month)");
		
		CanadaInterestService cis = new CanadaInterestService();
		double initialValue2 = 200;
		int months2 = 3;
		cis.payment(initialValue, months); // 206.06
		
		
		

	}

}
