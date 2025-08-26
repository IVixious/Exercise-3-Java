import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter your first number: ");
       int num = sc.nextInt();
       System.out.println("Please enter your second number: ");
       int num2 = sc.nextInt();
       System.out.println("Please enter your third number: ");
       int num3 = sc.nextInt();

       int largest;
       if (num > num2 && num > num3) {
           largest = num;
       } else if (num2 > num && num2 > num3) {
           largest = num2;
       } else {
           largest = num3;
       }

       int smallest;
       if(num < num2 && num < num3) {
           smallest = num;
       } else if(num2 < num && num2 < num3) {
           smallest = num2;
       } else {
           smallest = num3;
       }

       System.out.println("The largest number is " + largest);
       System.out.println("The smallest number is " + smallest);

       sc.close();
       // Practice closing scanner!
    }
}
