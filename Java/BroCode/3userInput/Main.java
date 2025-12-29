// Need this for user input:
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        // For taking the full line as string
        String name = scanner.nextLine();
        System.out.println("Hello " + name);


        // for integers
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old!");

        // for decimals
        System.out.println("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("You gpa is: " + gpa);        

        // for boolean use scanner.nextBoolean() - accepts true/false

        // have to be careful after using nextX(), where X is int, double etc, because that just takes X, not the end of the line
        // So, to flush the entire line, use nextLine(), which clears the line, and keep the buffer fresh.

        System.out.println("Enter your eye color: ");
        // this won't work - because the input buffer is still at a place where you last entered gpa, first need to clear it
        // String color = scanner.nextLine();

        // clear buffer
        scanner.nextLine();
        // then take the next line input
        String color = scanner.nextLine();
        System.out.println("Your eye color is " + color);

        scanner.close();
    }
}