import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class segregate_even_odd {

    // Method 1 to solve the this question
    static void segregateEvenOdd(int arr[]) {
        /*
            This solution does not gives us TLE but
            voilate the conditions means it uses
            extra space for the elements which is not allowed.
        */

        int n = arr.length;

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        // Segregate all the elements in the different list
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        // Sort both the lists
        Collections.sort(evenList);
        Collections.sort(oddList);

        // Overwrite the original array
        int idx = 0;
        for (int i = 0; i < evenList.size(); i++) {
            arr[idx++] = evenList.get(i);
        }
        for (int i = 0; i < oddList.size(); i++) {
            arr[idx++] = oddList.get(i);
        }
    }


    // Method 2 to solve this question
    static void segregateEvenOdd2(int arr[]) {
        /*
         * this solution gives us TLE because
         * the sort function is implemented as QUICK SORT
         * and the time complexity is O(n^2)
         * that's why we avoid this solution
         * 
         * Instead of that we can use the in-built sorting function
         * and get the write answer
         * 
         * Implementation of in-build sorting function
         * -> Arrays.sort(arr, 0, idx); // Sort the even numbers
         * -> Arrays.sort(arr, idx, arr.length); // Sort the odd numbers
         * 
         * use these two lines for the sorting and delete the sort function
         */
        // code here
        int low = 0;
        int hig = arr.length - 1;
        while (low < hig) {
            while (arr[low] % 2 == 0 && low < hig) {
                low++;
            }
            while (arr[hig] % 2 != 0 && low < hig) {
                hig--;
            }
            if (low < hig) {
                int temp = arr[low];
                arr[low] = arr[hig];
                arr[hig] = temp;
                low++;
                hig--;
            }
        }

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                idx = i;
                break;
            }
        }

        sort(arr, idx, arr.length); // Sort the odd numbers
        sort(arr, 0, idx); // Sort the even numbers
    }

    // Sort the array from start to end
    static void sort(int arr[], int start, int end) {
        boolean swapped;

        // Run the steps in the n-1 times
        for (int i = start; i < end; i++) {
            swapped = false;

            // For each step, max item will come at last respective index
            for (int j = start + 1; j < end; j++) {

                // Swap items if the current item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped) {
                break;
            }
        }
    }

    // Swaping function
    static void swap(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String str = obj.nextLine();
        String strarray[] = str.split(",");

        int arr[] = new int[strarray.length];

        for (int i = 0; i < strarray.length; i++) {
            arr[i] = Integer.parseInt(strarray[i]);
        }

        System.out.println("Original array");
        System.out.println(Arrays.toString(strarray));
        segregateEvenOdd2(arr);
        System.out.println("Segregated array");
        System.out.println(Arrays.toString(arr));

        obj.close();
    }
}
