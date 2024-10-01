package Assignment5and6;

import java.util.Scanner;


public class Array1 {
    public static void main(String [] args){
        int i;
        Scanner sc =new Scanner(System.in);
        int []arr=new int[5];
        for ( int x:arr) {
            System.out.print(x);
        }
        System.out.println("Enter the updated values of array");

        for(i=0;i< arr.length;i++){
           //int i = 0;
           arr[i]=sc.nextInt();
        }
        System.out.print("updated arrray is= ");
        for(int x:arr){
            System.out.print(x);

        }


    }

}
