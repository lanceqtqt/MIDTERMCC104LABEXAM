package Stacking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option1 = 0;
        Scanner in = new Scanner(System.in);
        PrintWithTyping("Welcome to the Midterm Laboratory of CC104 Data Structure And Algorithm\n", 50);
        PrintWithTyping("In this system, we will conduct 2 programs connected in the lesson that we tackled, which is Stack\n", 50);
        PrintWithTyping("You can choose freely on what program you will use!!\n", 50);

        boolean repeatProgram = true;
        while (repeatProgram) {
            System.out.println("\n[1] Name Reversing using Stack");
            System.out.println("[2] Sorting using another Sort");
            System.out.println("[3] Exit the Program");
            PrintWithTyping("Please Enter your Choice: ", 50);
            option1 = in.nextInt();
            in.nextLine(); // Consume the newline character

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