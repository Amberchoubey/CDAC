package BMITracker;
import java.util.Scanner;


public class discount {
	private int price;
	private double discount_percent;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the price=");
		price=sc.nextInt();
		System.out.println("enter the Discount percent=");
		discount_percent=sc.nextDouble();

	}
	public double calculateDiscount() {
		double discountAmount = price * (discount_percent / 100);
		return discountAmount;
		
	}
	public void printRecord  () {
		double finalPrice = price - calculateDiscount();
		System.out.println(calculateDiscount());
		System.out.println(finalPrice);
		
		
	}
	public static void main (String args[]) {
		discount d=new discount();
		d.acceptRecord();
		d.printRecord();
	}
	
	

}