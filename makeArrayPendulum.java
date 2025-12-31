import java.util.Arrays;
import java.util.Scanner;

public class makeArrayPendulum {

    public static int[] pendulumArrangement(int arr[]) {
        // Write your code here
        int n = arr.length;
        Arrays.sort(arr);

        int array[] = new int[n];

        int idx;
        if (n % 2 == 0) {
            idx = (n - 1) / 2;
        } else {
            idx = n / 2;
        }
        int j = idx + 1;

        for (int i = 0; i < n; i = i + 2) {
            array[idx--] = arr[i];
        }
        for (int i = 1; i < n; i = i + 2) {
            array[j++] = arr[i];
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String str = obj.nextLine();
        String strArray[] = str.split(",");

        int arr[] = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        int ans[] = pendulumArrangement(arr);

        System.out.println("Pendulum Array");
        System.out.println(Arrays.toString(ans));

        obj.close();
    }
}
