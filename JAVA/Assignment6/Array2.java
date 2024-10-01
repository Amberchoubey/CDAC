package Assignment5and6;

import java.util.Scanner;

public class Array2 {


        public static void main(String []args) {
            //Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];
            acceptrcord(arr);
            printrecord(arr);


        }

    public static void acceptrcord(int [] arr) {
        Scanner sc = new Scanner(System.in);
            for(int i=0;i< arr.length;i++){
                arr[i]=sc.nextInt();
               //return arr[i];
            }
        //printrecord(arr);
    }
    public static void printrecord(int arr[]) {
        System.out.print("array is= ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }





    }

