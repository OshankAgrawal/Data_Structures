import java.util.Scanner;

public class segregate_0s_and_1s {

    public static void segregate0and1(int[] arr) {
        // code here
        int hi = arr.length - 1;
        int lo = 0;
        while (lo < hi) {
            while (arr[lo] == 0 && lo < hi) {
                lo++;
            }
            while (arr[hi] == 1 && lo < hi) {
                hi--;
            }
            if (lo < hi) {
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                lo++;
                hi--;
            }
        }
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
        for (int num : arr) {
            System.out.print(num + " ");
        }

        segregate0and1(arr);
        System.out.println("\nSegragated array");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        obj.close();
    }
}
