//Write a program that uses a nested switch statement to print out the day of the week based on an 
//integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
//is a weekday or weekend
public class Switch { 
 public static void main(String[] args) { 
 int num = 7; 
 if(num>=1&num<=7){
 switch(num) { 
 case 1: 
 System.out.println("monday"); 
 break; 
 case 2: 
 System.out.println("Tuesday");
 break; 
  case 3: 
 System.out.println("wednesday");
 break; 
 case 4: 
 System.out.println("thursday");
 break; 
 case 5: 
 System.out.println("friday"); 
 break;
  case 6: 
 System.out.println("saturday"); 
 break; 
 default :
  System.out.println("sunday"); 
  break;

 
 }
 } 
 } 
}