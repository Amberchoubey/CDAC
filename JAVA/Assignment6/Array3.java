package Assignment5and6;

import java.util.Scanner;


public class Array3 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int [] arr=new int [10];
        int high=Integer.MIN_VALUE;
        int low=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>high){
                high=arr[i];
            }
            if(arr[i]<low){
                low=arr[i];
            }
        }
        System.out.println("Maximum value  is="+high+"   "+"Minimum value  is=  "+"   "+low);
    }


}