Question ->2 

public class Bmi {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter weight");
        float w =sc.nextFloat();
        System.out.println("enter Height in meteres");
        float h =sc.nextFloat();
        h=h*h;
        float bmi=w/h;
        System.out.println("your Bmi="+bmi);
        if(bmi<18.5){
            System.out.println("underweight and possibly malnourished.");
        } else if (bmi >=18.5 || bmi<= 24.9) {
            System.out.println("healthy weight range");
            
        }
        else {
            System.out.println("you are overweight");
        }

    }
}
