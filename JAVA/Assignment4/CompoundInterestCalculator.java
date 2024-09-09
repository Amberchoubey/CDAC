import java.util.Scanner;

public class CompoundInterestCalculator {

    // Fields to store the investment details
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    public CompoundInterestCalculator(){
        this.principal=principal;
        this.annualInterestRate=annualInterestRate;
        this.numberOfCompounds=numberOfCompounds;
        this.years=years;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getannualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }



    public int getnumberofcompounds(){
        return numberOfCompounds;

    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    public int getyears(){
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    public double calculateFutureValue() {
        return getPrincipal() * Math.pow((1 + getannualInterestRate()/ getnumberofcompounds()), (getnumberofcompounds() * getyears()));
    }

    // Method to accept the investment details from the user

    public static class CompoundInterestCalculatorUtil{
        CompoundInterestCalculator cal=new CompoundInterestCalculator();

        public void printRecord() {
            double futureValue = cal.calculateFutureValue();
            double totalInterest = futureValue - cal.getPrincipal();

            System.out.printf("Future Value of the investment: ₹%.2f%n", futureValue);
            System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
        }
        public void acceptRecord(Scanner sc) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the initial investment amount (in ₹): ");
            cal.setPrincipal(sc.nextDouble());

            System.out.print("Enter the annual interest rate (in percentage): ");
              cal.setAnnualInterestRate(sc.nextDouble());
            System.out.print("Enter the number of times the interest is compounded per year: ");
            cal.setNumberOfCompounds(sc.nextInt());

            System.out.print("Enter the investment duration (in years): ");
           cal.setYears(sc.nextInt());
        }
        public int menuList() {
            Scanner sc =new Scanner (System.in);
            System.out.println("compound Interest Calculator Menu:");
            System.out.println("1. Print the future value and the total interest earned");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice =sc.nextInt();
            return choice;
        }
    }
}
 class Dhoom3 {
    public static void main (String[] args){


        CompoundInterestCalculator.CompoundInterestCalculatorUtil util=new CompoundInterestCalculator.CompoundInterestCalculatorUtil();
        Scanner sc=new Scanner(System.in);
        util.acceptRecord(sc);
        int choice;
        while((choice= util.menuList())!=0){
            switch(choice){
                case 1:  util.printRecord();
                             break;
                case 2:      break;

                default:   System.out.println("Invalid choice, please try again.");

            }

        }
    }
}
