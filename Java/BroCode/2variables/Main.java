public class Main{
    public static void main(String[] args){
        // Primitives

        // int - for integer values
        int age;
        age = 28;
        System.out.println(age);
        // Can combine with text/string
        System.out.println("The age is " + age);

        // double - for decimal values
        double price = 19.99;
        System.out.println("The price is $" + price);
        // can also store int in double
        price = 20;
        System.out.println("The price is $" + price);


        // char - for single character
        // remember to use single quote
        // char grade = "A";
        char grade = 'A';

        // boolean - for binary values (generally used internally)
        boolean isStudent = false;

        if (isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You aren't a student!!");
        }



        // Non-primitive

        // String - for text (series of characters)

        String food = "pizza";
        System.out.println("The best food is " + food);
        // can have numbers and symbols and emojis
        String email = "fakeemail55😁@email.com";
        System.out.println(email);
    }
}