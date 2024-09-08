package BMITracker;
import java.util.Scanner;


public class BMITracker {
    private int weight;
    private double height;
   
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Weight in kilograms= ");
        weight = scanner.nextInt();
        
        System.out.println("Enter the Height in meters = ");
        height = scanner.nextDouble();

    }
    public double calculateBMI() {
    	 double BMI = weight / (height * height);
    			 return BMI;
    }


    public String classifyBMI () {
    	if(calculateBMI()<18.5) {
   		 String s="Underweight";
   		 return s;
   		
   	}
    	else if(calculateBMI()>=18.5||calculateBMI()<=24.9) {
    		 String s="Normal weight";
    		 return s;
    		
    }
    	else if(calculateBMI()>=25||calculateBMI()<=29.9) {
   		 String s="Overweight";
   		return s;
   	}
    	else {
      		 String s="Obese";
      		 return s;
      		
    }
    	
    }
    public void  printRecord  () {
    	 System.out.println(calculateBMI()+" "+classifyBMI());
    	
    	
    }
    public static void main(String[] args) {
    	BMITracker track =new BMITracker();

    	track.acceptRecord();
        track.printRecord();
    }

}