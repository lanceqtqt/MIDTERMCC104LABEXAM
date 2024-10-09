package Stacking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeatProgram = true;
        Scanner in = new Scanner(System.in);
        PrintWithTyping("Welcome to the Midterm Laboratory of CC104 Data Structure And Algorithm\n", 50);
        PrintWithTyping("In this system, we conducted 2 programs connected in the lesson that we tackled, which is Stack\n", 50);
        while (repeatProgram) {
        PrintWithTyping("You can choose freely on what program you will use!!\n", 50);

            System.out.println("\n[1] Name Reversing using Stack");
            System.out.println("[2] Sorting stack using another Stack");
            System.out.println("[3] Exit the Program");
            PrintWithTyping("Please Enter your Choice: ", 50);
        String input = in.nextLine(); // Read user input as a string
            
            // Check if the input is a valid integer
            if (!input.matches("\\d+")) {
                PrintWithTyping("\nThe only valid input in this section is only an Integer. Please Try Again!! \n", 50);
                continue; // Loop back to the menu
            }
            
            int option1 = Integer.parseInt(input); // Convert valid input to an integer
            switch (option1) {
                case 1:
                    NameReversing.NameReversingIntro(in);
                    break; // Return to main menu after name reversing
                case 2:
                    // Placeholder for sorting functionalities
                    SortingAnotherStack.SortingAnotherSortIntro(in);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    PrintWithTyping("\nYour Input was Invalid, Please Try Again!! \n", 50);
                    break;
            }
        }
        in.close();
    }

    static void PrintWithTyping(String message, int delay) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}