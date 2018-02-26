//import java.math.*;
public class CarInterest {

	private double totalPrice;
	private double downPayment;
	private int lengthOfLoan;
	private double interestRate;
	
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public int getLengthOfLoan() {
		return lengthOfLoan;
	}
	public void setLengthOfLoan(int lengthOfLoan) {
		this.lengthOfLoan = lengthOfLoan;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public CarInterest(double totalPrice, double downPayment, int lengthOfLoan, double interestRate) {
		super();
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.lengthOfLoan = lengthOfLoan;
		this.interestRate = interestRate;
	}
	public CarInterest() {
		
	}
	
	public double MonthlyPayment() {
		
		return (((this.interestRate / 100) / 12) * (this.totalPrice - this.downPayment)) / 
				(1 - Math.pow((1 + ((this.interestRate / 100) / 12)), (0 - this.lengthOfLoan)));
		
	}
	
	public double TotalSpentInterest() {
		
		return (this.MonthlyPayment() * this.lengthOfLoan) - (this.totalPrice - this.downPayment);
		
	}
}
