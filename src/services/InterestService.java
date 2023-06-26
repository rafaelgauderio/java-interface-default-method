package services;

public interface InterestService {
	
	public abstract double getInterestRate();
	public abstract void payment(double initialValue, int months);

}
