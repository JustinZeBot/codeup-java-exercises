import java.util.Scanner;

public class HelloWorld {
    public static void  main(String[] args) {
        System.out.println("hello World!");



        Scanner Scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userInput = Scanner.nextLine();
        System.out.println("Hello, " + userInput);
    }
}

