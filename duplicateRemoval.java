import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class duplicateRemoval {

    // Method 1
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // This solution gives us TLE
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }

    // Method 2
    static ArrayList<Integer> removeDuplicate2(int arr[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        return new ArrayList<>(set);
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

        System.out.println("New Array");
        System.out.println(removeDuplicate(arr));

        System.out.println(removeDuplicate2(arr));
    }
}
