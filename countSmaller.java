import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countSmaller {

    public static int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count = 0;
        for (int num : arr) {
            if (num <= x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();
        obj.nextLine();

        String str = obj.nextLine();
        String strArray[] = str.split(",");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < strArray.length; i++) {
            list.add(Integer.parseInt(strArray[i]));
        }

        System.out.println(countOfElements(num, list));

        obj.close();
    }
}
