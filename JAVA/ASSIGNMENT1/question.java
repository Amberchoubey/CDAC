Question ->4


public class Months {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of month");
        int month=sc.nextInt();
            if (month == 3 || month == 4 || month == 5) {
                System.out.println("the month is spring");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.println("the month is summer");
            } else if (month == 9 || month == 10 || month == 11) {
                System.out.println("the month is Autumn");
            } else if(month == 12 || month == 1 || month == 12) {
                System.out.println("the month is Winter");

            }
            else {
                System.out.println("enter a valid number");
            }

            }


    }