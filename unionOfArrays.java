import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class unionOfArrays {

    // Method 1 it gives us TLE
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:a){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        for(int num:b){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }

    // Method 2
    public static ArrayList<Integer> findUnion2(int[] a, int[] b) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        String str=obj.nextLine();
        String strarray[]=str.split(",");

        int arr[]=new int[strarray.length];

        for(int i=0;i<strarray.length;i++){
            arr[i]=Integer.parseInt(strarray[i]);
        }

        String str2=obj.nextLine();
        String strarray2[]=str2.split(",");

        int arr2[]=new int[strarray2.length];

        for(int i=0;i<strarray2.length;i++){
            arr2[i]=Integer.parseInt(strarray2[i]);
        }

        System.out.println("Method 1");
        System.out.println(findUnion(arr, arr2));

        System.out.println("Method 2");
        System.out.println(findUnion2(arr, arr2));

        obj.close();
    }
}
