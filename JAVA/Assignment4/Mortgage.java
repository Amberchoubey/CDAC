import java.util.Scanner;

public class LoanAmortizationCalculator {
    private double principal_amount;
    private double annual_interest_rate;
    private int loan_term;

    public LoanAmortizationCalculator() {
        this.principal_amount = principal_amount;
        this.annual_interest_rate = annual_interest_rate;
        this.loan_term = loan_term;
    }

    public double getPrincipal_amount() {
        return principal_amount;
    }

    public void setPrincipal_amount(double principal_amount) {
        this.principal_amount = principal_amount;
    }

    public double getAnnual_interest_rate() {
        return annual_interest_rate;
    }

    public void setAnnual_interest_rate(double annual_interest_rate) {
        this.annual_interest_rate = annual_interest_rate;
    }

    public int getLoan_term() {
        return loan_term;
    }

    public void setLoan_term(int loan_term) {
        this.loan_term = loan_term;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = getAnnual_interest_rate() / 12 / 100;
        double numberOfMonths = getLoan_term() * 12;
        double monthlyPayment = (getPrincipal_amount() * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));
        return monthlyPayment;
    }

    public static class LoanAmortizationCalculatorUtil {
        private LoanAmortizationCalculator loan = new LoanAmortizationCalculator();

        public void acceptRecord(Scanner sc) {
            //Scanner sc = new Scanner(System.in);
            System.out.println("enter principal amount");
            loan.setPrincipal_amount(sc.nextDouble());
            System.out.println("Enter Annual interst rate");
            loan.setAnnual_interest_rate(sc.nextDouble());
            System.out.println("Enter Loan Term");
            loan.setLoan_term(sc.nextInt());
        }


        public void printRecord() {
            double calculator = loan.calculateMonthlyPayment();
            double amount_paid = calculator * (loan.getLoan_term() * 12);
            System.out.println("Monthly Payment=" + calculator);
            System.out.println("total amount paid over the life of the loan=" + amount_paid);


        }
        public int menuList() {
            Scanner sc =new Scanner (System.in);
            System.out.println("Mortgage Calculator Menu:");
            System.out.println("1. Calculate mortgage payment");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice =sc.nextInt();
            return choice;
        }


    }
}
class jadu {
    public static void main(String[] args) {
        //LoanAmortizationCalculator loan = new LoanAmortizationCalculator();

        LoanAmortizationCalculator.LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculator.LoanAmortizationCalculatorUtil();
        Scanner sc = new Scanner(System.in);
        util.acceptRecord(sc);
        //util.printRecord();
        //util.menuList();
        int choice;
        while((choice= util.menuList())!=0){
            switch(choice){
                case 1:   util.printRecord();
                           break;
                case 2:      break;

                default:   System.out.println("Invalid choice, please try again.");

            }

        }
    }
}

