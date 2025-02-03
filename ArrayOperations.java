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

    /**
     * Finds two neighboring numbers in the array with the smallest absolute difference.
     * param -  arr the input array of integers.
     * returns the index of the first number in the pair, or -1 if not applicable.
     */
    public static int findMinDistanceNeighborIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array does not have enough elements to find neighbors.");
            return -1;
        }
        
        int minIndex = 0;
        int minDiff = Math.abs(arr[1] - arr[0]);
        
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

     /**
     * Converts an integer array to an ArrayList of Integers.
     * @param array the input array.
     * @return an ArrayList containing the array elements.
     */
    public static ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    /**
     * Converts an ArrayList of Integers to an integer array.
     * @param list the input ArrayList.
     * @return an array containing the elements of the ArrayList.
     */
    public static int[] arrayListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}