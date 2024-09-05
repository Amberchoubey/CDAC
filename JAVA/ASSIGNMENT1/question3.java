Question ->3 

public class Voter {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter person's age");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("person is voter");
        }
        else{
            System.out.println("person is not eligble for voting");
        }
    }
}
