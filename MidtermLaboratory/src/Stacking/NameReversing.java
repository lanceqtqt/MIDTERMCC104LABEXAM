package Stacking;

import java.util.Scanner;
import java.util.Stack;

public class NameReversing {
    public static void NameReversingIntro(Scanner in) {

            Main.PrintWithTyping("\nWelcome to Name Reversing System using Stack Algorithm^^\n", 50);
            Main.PrintWithTyping("In this system, the user will input a name and the system will reverse it using stack algorithm!!\n", 50);
        while (true) {
            Main.PrintWithTyping("\nType your name or even a full name: ", 50);
            String name = in.nextLine(); // Read the name input
            String reversedName = reverseName(name);
            Main.PrintWithTyping("Reversed string using a stack is: " + reversedName, 50);

            if (!attemptContinuation(in)) {
                break; // Exit the loop and return to the main menu
            }
        }
    }

    public static String reverseName(String name) {
        Stack<Character> stack = new Stack<>();
        for (char ch : name.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static boolean attemptContinuation(Scanner in) {
        while (true) {
            System.out.println("\n\nDo you wish to continue?");
            System.out.println("[1] Try again with another name");
            System.out.println("[2] Go back to the main menu");
            System.out.println("[3] Exit the program");

            System.out.print("Please Enter you Choice:");
            int choice = in.nextInt();
                    switch(choice){
                case 1:
                    return true; // Continue with the name reversing
                case 2:
                    return false; // Go back to the main menu
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}