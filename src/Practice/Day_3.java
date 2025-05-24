package Practice;

public class Day_3 {
    public static void main(String[] args) {
        // Display the topic for the day
        System.out.println("Today's topic:");
        System.out.println("1. Typecasting");
        System.out.println("2. Operators");
        System.out.println("3. String");

        // ----------- Typecasting Example -----------
        // Implicit typecasting (widening)
        int num1 = 10;
        double result1 = num1;  // int to double
        System.out.println("\nImplicit Typecasting (int to double): " + result1);

        // Explicit typecasting (narrowing)
        double num2 = 10.75;
        int result2 = (int) num2;  // double to int
        System.out.println("Explicit Typecasting (double to int): " + result2);

        // ----------- Operators Example -----------
        int a = 10, b = 5;
        System.out.println("\nArithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));

        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 10) = " + (a > 5 && b < 10));
        System.out.println("(a > 15 || b < 10) = " + (a > 15 || b < 10));

        // ----------- String Example -----------
        String name = "Codex";
        String greeting = "Hello, " + name + "!";  // String concatenation
        System.out.println("\n" + greeting);

        // Some useful string methods
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Does name contain 'dex'? " + name.contains("dex"));
    }
}
