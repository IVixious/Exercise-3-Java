import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Please enter a number (1 to 9999): ");
       int number = sc.nextInt();

       if (number >= 1 && number <= 9999) {
           if (number < 10) {
               System.out.println(number + " is a one digit number");
           } else if (number < 100) {
               System.out.println(number + " is a two digit number");
           } else if (number < 1000) {
               System.out.println(number + " is a three digit number");
           } else {
               System.out.println(number + " is a four digit number");
           }
       } else {
           System.out.println("Invalid input! Please enter a number between 1 and 9999.");
       }
       sc.close();
       // Practice closing scanner!
    }
}