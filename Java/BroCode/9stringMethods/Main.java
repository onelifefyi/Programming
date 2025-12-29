import java.util.Scanner;

public class Main{
    public static void main(String[ ] args){
        String myStr = "My test string";
        // int length = myStr.length();
        // char letter = myStr.charAt(0);
        // int index = myStr.indexOf("s");
        // int lastIndex = myStr.lastIndexOf("s");

        // String upperStr = myStr.toUpperCase();
        // String lowerStr = myStr.toLowerCase();

        // myStr = "   My test String.   ";
        // myStr = myStr.trim();

        // myStr = myStr.replace('t', 'p');

        // check if empty
        // System.out.println(myStr.isEmpty());

        // check if contains a char, search
        // System.out.println(myStr.contains(" "));

        // System.out.println(myStr.equals("another test string"));


        // Substring
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = sc.nextLine();
        // String username = email.substring(0, 7);
        // String domain = email.substring(8);

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("Your username is " + username);
        System.out.println("Your domain is " + domain);

        sc.close();

    }
}