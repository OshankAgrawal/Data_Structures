import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers_Containing_1_2_and_3 {

    public static ArrayList<Integer> filterByDigits(int[] arr) {
        // code here
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (decide(arr[i])) {
                resultList.add(arr[i]);
            }
        }
        return resultList;
    }

    static boolean decide(int num) {
        List<Integer> digits = new ArrayList<>(List.of(1, 2, 3));
        while (num != 0) {
            if (!digits.contains(num % 10)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String str = obj.nextLine();
        String strArray[] = str.split(",");

        int arr[] = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        System.out.println(filterByDigits(arr));

        obj.close();
    }
}