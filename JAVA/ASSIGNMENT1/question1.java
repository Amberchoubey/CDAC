
public class UseCircle {
    public static void main(String... args) {
//		while (true)
//		{

        System.out.println("Enter Year to check");

        Scanner s = new Scanner(System.in);

        int year = s.nextInt();
        int ch;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            ch = 1;
        } else {
            ch = 2;
        }
        switch (ch) {
            case 1:
                System.out.println("Leap year");
                break;

            case 2:
                System.out.println("Not a Leap year");
                break;
            default:
                System.out.println("default");
                break;
        }


        // }

    }}
