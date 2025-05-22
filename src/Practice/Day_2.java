package Practice; // This is a package declaration.
// A package is used to group related classes and helps organize your code.
// "Practice" is the name of this package.

/**
 * This is a class declaration.
 * A class is a blueprint for creating objects and contains methods and variables.
 * The class name is "Day_2", which should match the filename "Day_2.java".
 */
public class Day_2 {

    /**
     * This is the main method — the entry point of any Java application.
     * The JVM looks for this method to start the program.
     *
     * - public: accessible from anywhere
     * - static: doesn't require an object to run
     * - void: does not return any value
     * - String[] args: accepts command-line arguments as an array of Strings
     */
    public static void main(String[] args) {

        // The main method is mandatory in Java applications.
        // Without it, the program will not compile or run.

        // Output in Java:
        // System.out.println() prints text followed by a newline.
        // System.out.print() prints text without moving to a new line.

        System.out.println("This is Day 2 of Java programming revision.");

        // Printing a header for today's topic
        System.out.println("Today's topics are:");

        // Listing the topics covered
        System.out.println("1. Java Syntax");
        System.out.println("2. Java Output / Print statements");
        System.out.println("3. Java Comments");

        // -------------------------------------
        // Demonstration of Single-Line Comments
        // -------------------------------------

        // This is a single-line comment.
        // Everything after the // is ignored by the compiler.

        // System.out.println("This line is commented out and won't be executed.");

        // -------------------------------------
        // Demonstration of Multi-Line Comments
        // -------------------------------------

        /*
         This is a multi-line comment.
         It spans across multiple lines.
         Useful for describing logic or disabling a block of code.
        */

        /*
        System.out.println("This is inside a multi-line comment.");
        System.out.println("It will not be executed.");
        */

        // Final reminder
        System.out.println("Make sure to read and understand comments in the code!");
    }
}
