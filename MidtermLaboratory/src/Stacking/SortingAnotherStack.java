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
            System.out.println("\nOriginal Stack: " + stack);

            // Prompt user for sorting order
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.print("Choose sorting order: ");
            int orderChoice = in.nextInt();
            in.nextLine(); // Consume the newline character

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

                System.out.println("\nFinal Sorted Stack: " + stack);
            } else {
                System.out.println("Invalid input! Please choose 1 for Ascending or 2 for Descending.");
                continue; // Skip to the next iteration to allow re-selection
            }

            // Prompt user for next action
            continueSorting = attemptContinuation(in);
        }
    }

    public static boolean attemptContinuation(Scanner in) {
        while (true) {
            System.out.println("\nDo you wish to continue?");
            System.out.println("[1] Sort again");
            System.out.println("[2] Go back to the main menu");
            System.out.println("[3] Exit the program");

            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    return true; // Continue with sorting
                case "2":
                    return false; // Go back to the main menu
                case "3":
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}