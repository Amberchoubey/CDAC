import java.util.Scanner;

public class LoanAmortizationCalculator {
    private double principal_amount;
    private double annual_interest_rate;
    private int loan_term ;

    public void setRecord( ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal amount");
        principal_amount = sc.nextDouble();
        System.out.println("Enter Annual interst rate");
        annual_interest_rate = sc.nextDouble();
        System.out.println("Enter Loan Term");
        loan_term = sc.nextInt();
    }
    public double calculateMonthlyPayment(){
        double monthlyInterestRate = annual_interest_rate / 12 / 100 ;
        double numberOfMonths = loan_term * 12;
        double monthlyPayment = (principal_amount * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfMonths) ) /
                ( Math.pow(1+monthlyInterestRate, numberOfMonths)-1));
        return monthlyPayment;
    }

    public void printRecord( ) {
        double calculator= calculateMonthlyPayment();
        double amount_paid =calculator *(loan_term*12);
        System.out.println("Monthly Payment="+calculator);
        System.out.println("total amount paid over the life of the loan="+amount_paid);


    }
    public static void main(String[] args) {
        LoanAmortizationCalculator loan = new LoanAmortizationCalculator();
        loan.setRecord();
        loan.printRecord();
    }
}
