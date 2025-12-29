import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("You are adult");
        }
        else if (age < 0){
            System.out.println("You haven't been born yet");
        }
        else{
            System.out.println("You are a child!!");
        }
        scanner.close();
    }
}