package Stacking;
import java.util.Scanner;
import java.util.Stack;

public class SortingAnotherStack {
    public static void SortingAnotherSortIntro(Scanner in) {
        boolean continueSorting = true;

        while (continueSorting) {
            Stack<Integer> temporaryStack = new Stack<>();
            Stack<Integer> stack = new Stack<>();
            int arr[] = {1, 5, 5, 2, 3, 8};

            for (int value : arr) {
                stack.push(value);
            }
            Main.PrintWithTyping("\nOriginal Stack: "+ stack, 50);

            // Prompt user for sorting order
            System.out.println("\n[1] Ascending");
            System.out.println("[2] Descending");
            Main.PrintWithTyping("Please Enter your Choice: ", 50);
        String input = in.nextLine(); // Read user input as a string
            
            // Check if the input is a valid integer
            if (!input.matches("\\d+")) {
                Main.PrintWithTyping("\nThe only valid input in this section is only an Integer. Please Try Again!! \n", 50);
                continue; // Loop back to the menu
            }
            
            int orderChoice = Integer.parseInt(input); // Convert valid input to an integer
         

            // Validate input and perform sorting if valid
            if (orderChoice == 1 || orderChoice == 2) {
                // Sorting logic
                while (!stack.isEmpty()) {
                    int temp = stack.pop();

                    if (orderChoice == 1) { // Ascending order
                        while (!temporaryStack.isEmpty() && temporaryStack.peek() > temp) {
                            stack.push(temporaryStack.pop());
                        }
                    } else { // Descending order
                        while (!temporaryStack.isEmpty() && temporaryStack.peek() < temp) {
                            stack.push(temporaryStack.pop());
                        }
                    }

                    temporaryStack.push(temp);
                }

                // Transfer sorted elements back to the original stack
                while (!temporaryStack.isEmpty()) {
                    stack.push(temporaryStack.pop());
                }

                Main.PrintWithTyping("\nFinal Sorted Stack: " + stack,50);
            } else {
            	Main.PrintWithTyping("Invalid input! Please choose 1 for Ascending or 2 for Descending.",50);
                continue; // Skip to the next iteration to allow re-selection
            }

            // Prompt user for next action
            continueSorting = attemptContinuation(in);
        }
    }

    public static boolean attemptContinuation(Scanner in) {
        while (true) {
        	Main.PrintWithTyping("\nDo you wish to continue?\n",50);
            System.out.println("[1] Sort again");
            System.out.println("[2] Go back to the main menu");
            System.out.println("[3] Exit the program");
            Main.PrintWithTyping("Please Enter your Choice: ",50);
        String input = in.nextLine(); // Read user input as a string
            
            // Check if the input is a valid integer
            if (!input.matches("\\d+")) {
                Main.PrintWithTyping("\nThe only valid input in this section is only an Integer. Please Try Again!! \n", 50);
                continue; // Loop back to the menu
            }
            
            int choice = Integer.parseInt(input); // Convert valid input to an integer
            switch (choice) {
                case 1:
                    return true; // Continue with sorting
                case 2:
                    return false; // Go back to the main menu
                case 3:
                	Main.PrintWithTyping("Exiting the program. Goodbye!",50);
                    System.exit(0); // Exit the program
                default:
                	Main.PrintWithTyping("Invalid option, please try again.",50);
            }
        }
    }
}