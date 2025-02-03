import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperations {

    /**
     * Separates the given numbers into even and odd arrays, and prints them.
     * @param numbers the input array of integers.
     */
    public static void separateEvenOdd(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        
        // Convert the ArrayLists to arrays
        int[] even = new int[evenList.size()];
        int[] odd = new int[oddList.size()];
        
        for (int i = 0; i < evenList.size(); i++) {
            even[i] = evenList.get(i);
        }
        for (int i = 0; i < oddList.size(); i++) {
            odd[i] = oddList.get(i);
        }
        
        System.out.println("Even numbers: " + Arrays.toString(even));
        System.out.println("Odd numbers: " + Arrays.toString(odd));
    }