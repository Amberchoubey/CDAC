package Javaassignment;
import java.util.Scanner;

public class CompoundInterestCalculator {
	private double investment_amount;
	private double annual_interest_rate;
	private int compounded_per_year;
	private int years;
	

	public void acceptRecord() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the investment amount");
		investment_amount=sc.nextDouble();
		System.out.println("Enter the Annual_interest_rate");
		annual_interest_rate=sc.nextDouble()/100;
		System.out.println("Enter the number of compounds");
		compounded_per_year=sc.nextInt();
		System.out.println("Enter the number of Years");
		years =sc.nextInt();
		
	}
	public double calculateFutureValue() {
		double futureValue =  investment_amount * Math.pow((1 + annual_interest_rate / compounded_per_year), ( compounded_per_year * years));
		//double totalInterest = futureValue - investment_amount;
		return futureValue;
		
	}
	public void printRecord() {
		System.out.println(calculateFutureValue()+" Rupees");
		double totalInterest = calculateFutureValue() - investment_amount;
		
		System.out.println( totalInterest+" Rupees");
	}
	public static void main(String []args) {
		
		 CompoundInterestCalculator cal =new  CompoundInterestCalculator();
		 cal.acceptRecord();
		 
		 cal.printRecord();
		 
	}


}