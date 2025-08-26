import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter an integer number: ");
       int number = sc.nextInt();

       if (number > 0) {
           System.out.println("The number " + number + " is a positive number");
       }
       else if (number < 0) {
           System.out.println("The number " + number + " is a negative number");
           }
       else {
           System.out.println("The number is zero");
       }
       sc.close();
       // Practice closing scanner!
    }
}