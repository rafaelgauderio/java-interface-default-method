package services;

import java.security.InvalidParameterException;

public class CanadaInterestService {

	private double interestRate = 1.0;

	public CanadaInterestService() {

	}

	public CanadaInterestService(double interestRate) {

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
			System.out.println("Payment after " + months + " months is " + String.format("U$ %.2f",totalPayment));
		}
	}

}
