 //Write a program to calculate the discount based on the total purchase amount. Use the following 
//criteria: 
// If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
// If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
// If the total purchase is less than Rs.500, apply a 5% discount
public class Discount { 
 public static void main(String[] args) { 
 int pch=1000;
 double price;
 if(pch>=1000){
	 price=(pch*20)/100;
 }
 else if(pch>=500 & pch<=999){
	 	 price=(pch*10)/100;

 }
 else{
	 	 	 price=(pch*5)/100;

 }

 System.out.println(price);

 } 
 } 