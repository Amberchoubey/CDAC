import java.util.Scanner;

public class BmiIndexbygettersetter {


        private int weight;
        private double height;
        public void BmiIndexbygettersetter(){
            this.weight=weight;
            this.height=height;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateBMI() {
        double BMI = getWeight() / (getHeight() * getHeight());
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

public  static class BmiIndexbygettersetterutil{

    BmiIndexbygettersetter bgs=new BmiIndexbygettersetter();
   public void acceptRecord(Scanner sc) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Weight in kilograms= ");
           bgs.setWeight(scanner.nextInt());
        System.out.println("Enter the Height in meters = ");
        bgs.setHeight(scanner.nextDouble());
    }
    public void  printRecord  () {
        System.out.println(bgs.calculateBMI()+" "+bgs.classifyBMI());


    }
    public int menuList() {
        Scanner sc =new Scanner (System.in);
        System.out.println("BMI INDEX Menu:");
        System.out.println(" 1 for Display the BMI value and its classification.");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        int choice =sc.nextInt();
        return choice;
    }


}


}
class BMI{
    public static void main(String[] args) {
        BmiIndexbygettersetter.BmiIndexbygettersetterutil bmi=new BmiIndexbygettersetter.BmiIndexbygettersetterutil();
        Scanner sc =new Scanner(System.in) ;
        bmi.acceptRecord(sc);
        int choice;
        while((choice=bmi.menuList())!=0){
            switch(choice){
                case 1:  bmi.printRecord();
                    break;
                case 2:      break;

                default:   System.out.println("Invalid choice, please try again.");

            }

        }
    }
}
