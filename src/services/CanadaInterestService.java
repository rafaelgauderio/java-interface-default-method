package services;

public class CanadaInterestService implements InterestService {

	private double interestRate = 1.0;

	public CanadaInterestService() {

	}

	public CanadaInterestService(double interestRate) {

		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	

}
