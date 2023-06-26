package services;

import java.security.InvalidParameterException;

public interface InterestService {

	public abstract double getInterestRate();

	default void payment(double initialValue, int months) {
		if (months < 1 || months > 60) {
			throw new InvalidParameterException("Months must be greater than zero and smaller than sixty");

		} else {
			double totalPayment = initialValue * Math.pow(1.0 + getInterestRate() / 100.0, months);
			String currency = "";
			if (getInterestRate() == 2.00) {
				currency = "R$";
				System.out.println(
						"Payment after " + months + " months is " + String.format(currency + " %.2f", totalPayment));
			} else if (getInterestRate() == 1.00) {
				currency = "US";
				System.out.println(
						"Payment after " + months + " months is " + String.format(currency + " %.2f", totalPayment));
			} else  {				
				System.out.println(
						"Payment after " + months + " months is " + String.format("%.2f", totalPayment));
			}

		}
	}

}
