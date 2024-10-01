package Assignment5and6;

import java.util.Scanner;

//Modify the previous assignment to use getter and setter methods
// instead of acceptRecord and printRecord.
public class Array8 {
int[] arr;
int i;

    public Array8(int size) {
        arr=new int[size];
    }


    public int getarr1() {

       return arr.length;
    }
    public int getArr() {

         return arr[i++];
    }


    public void setArr(Scanner sc) {
                 for(int i=0;i<arr.length;i++){
                    arr[i]= sc.nextInt();
              }


    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        Array8 ar=new Array8(size);
        ar.setArr(sc);
        System.out.println("array is    =  ");
         for(int i=0;i< ar.getarr1();i++) {
             System.out.print(ar.getArr() + " ");
         }

   }
}