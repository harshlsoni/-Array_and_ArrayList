import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInput to get numbers from the user
        UserInput input = new UserInput();
        int[] numbers = input.getNumbers();
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Separate Even and Odd Numbers");
            System.out.println("2. Find Neighboring Numbers with the Smallest Difference");
            System.out.println("3. Convert Array to ArrayList and Back");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Separating Even and Odd Numbers ---");
                    ArrayOperations.separateEvenOdd(numbers);
                    break;
                case 2:
                    System.out.println("\n--- Finding Neighboring Numbers with the Smallest Difference ---");
                    int index = ArrayOperations.findMinDistanceNeighborIndex(numbers);
                    if (index != -1 && index + 1 < numbers.length) {
                        System.out.println("The two neighboring numbers with the smallest difference are: " +
                                           numbers[index] + " and " + numbers[index + 1] +
                                           " (starting at index " + index + ").");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Converting Array to ArrayList and Back ---");
                    ArrayList<Integer> numberList = ArrayOperations.arrayToArrayList(numbers);
                    System.out.println("Converted ArrayList: " + numberList);
                    
                    int[] convertedArray = ArrayOperations.arrayListToArray(numberList);
                    System.out.println("Converted back to Array: " + Arrays.toString(convertedArray));
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 4.");
            }
        }
        scanner.close();
    }
}
