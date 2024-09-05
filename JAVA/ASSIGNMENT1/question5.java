Question -> 5

public class Area {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Shape");
        String s=sc.nextLine();
        switch(s){
            case "Circle":
                System.out.println("enter radius of circle");
                float r=sc.nextFloat();
                float area=(float)(3.14*r*r);
                System.out.println("Area of Circle is="+area);

            case "Square":
                System.out.println("enter side of square");
                int side=sc.nextInt();
                 area=side*side;
                System.out.println("area of square is="+area);
            case "Rectangle":
                System.out.println("enter Length");
                int l=sc.nextInt();
                System.out.println("enter height");
                int b=sc.nextInt();
                area=l*b;
                System.out.println("Area of Rectangle is="+area);
            case "Triangle":
                System.out.println("enter breadth");
                 b=sc.nextInt();
                System.out.println("Enter height");
                int h=sc.nextInt();
                  float area1= (b *h)/2;
                System.out.println("area of triangle is="+area1);


        }
    }
}