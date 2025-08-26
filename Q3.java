import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
       System.out.println("Enter your mark: ");
       int mark = sc.nextInt();

       if (mark < 39) {
           System.out.println("F");
       } else if (mark >= 40 && mark <= 49) {
           System.out.println("F+");
       } else if (mark >= 50 && mark <=54) {
           System.out.println("D");
       } else if (mark >= 55 && mark <= 64) {
           System.out.println("C");
       } else if (mark >= 65 && mark <= 69) {
           System.out.println("B");
       } else if (mark >= 70 && mark <= 74) {
           System.out.println("B+");
       } else if (mark >= 75 && mark <= 79) {
           System.out.println("A");
       } else if (mark >= 80 && mark <= 100) {
           System.out.println("A+");
       } else {
           System.out.println("Invalid mark for grading");
       }
       sc.close();
       // Practice closing scanner!
    }
}