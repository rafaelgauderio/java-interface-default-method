package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

	private double interestRate = 2.0;

	public BrazilInterestService() {

	}

	public BrazilInterestService(double interestRate) {

		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void payment(double initialValue, int months) {
		if (months < 1 || months > 60) {
			throw new InvalidParameterException("Months must be greater than zero and smaller than sixty");

		} else {
			double totalPayment = initialValue * Math.pow(1.0 + getInterestRate() / 100.0, months);
			System.out.println("Payment after " + months + " months is " + String.format("r$ %.2f",totalPayment));
		}
	}

}
