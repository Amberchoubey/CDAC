import java.util.Scanner;

public class DiscountCalculator {
    private int price;
    private double discount_percent;

    public DiscountCalculator() {
        this.price = price;
        this.discount_percent = discount_percent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(double discount_percent) {
        this.discount_percent = discount_percent;
    }

    public static class DiscountCalculatorUtil {
        DiscountCalculator dc = new DiscountCalculator();

        public void acceptRecord(Scanner sc) {
            //Scanner scs = new Scanner(System.in);
            System.out.println("enter the price=");
            dc.setPrice(sc.nextInt());
            System.out.println("enter the Discount percent=");
            dc.setDiscount_percent(sc.nextDouble());
        }

        public double calculateDiscount() {
            double discountAmount = dc.getPrice() * (dc.discount_percent / 100);
            return discountAmount;

        }

        public void printRecord() {
            double finalPrice = dc.price - calculateDiscount();
            System.out.println(calculateDiscount());
            System.out.println(finalPrice);


        }

        public int menuList() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calculation for retail sales Menu:");
            System.out.println("1. Print the discount amount and the final price of the item");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            return choice;
        }
    }

    public static void main(String args[]) {
        DiscountCalculatorUtil util = new DiscountCalculatorUtil();
        Scanner sc = new Scanner(System.in);
        util.acceptRecord(sc);
        int choice;
        while ((choice = util.menuList()) != 0) {
            switch (choice) {
                case 1:
                    util.printRecord();
                    break;
                case 2:
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");

            }


        }

    }
}
