import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInput to get numbers from the user
        UserInput input = new UserInput();
        int[] numbers = input.getNumbers();
        
        // 1. Separate numbers into even and odd arrays.
        System.out.println("\n--- Separating Even and Odd Numbers ---");
        ArrayOperations.separateEvenOdd(numbers);
        
        // 2. Find the two neighboring numbers with the smallest distance.
        System.out.println("\n--- Finding Neighboring Numbers with the Smallest Distance ---");
        int index = ArrayOperations.findMinDistanceNeighborIndex(numbers);
        if (index != -1 && index + 1 < numbers.length) {
            System.out.println("The two neighboring numbers with the smallest difference are: " +
                               numbers[index] + " and " + numbers[index + 1] +
                               " (starting at index " + index + ").");
        }
        
        // 3. Convert the array into an ArrayList and then back into an array.
        System.out.println("\n--- Converting Array to ArrayList and Back ---");
        ArrayList<Integer> numberList = ArrayOperations.arrayToArrayList(numbers);
        System.out.println("Converted ArrayList: " + numberList);
        
        int[] convertedArray = ArrayOperations.arrayListToArray(numberList);
        System.out.println("Converted back to Array: " + Arrays.toString(convertedArray));
    }
}
