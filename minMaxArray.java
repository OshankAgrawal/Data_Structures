import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class minMaxArray {

    public static ArrayList<Integer> getMinMax(int[] arr) {
        // Time complexity -> O(n log(n))
        // code Here solution
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        return list;
    }

    public static ArrayList<Integer> getMinMax2(int[] arr) {
        // Time complexity -> O(n)
        // code Here solution
        
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;

        int minValue=Integer.MAX_VALUE;
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            minValue = Math.min(minValue, arr[i]);
            maxValue = Math.max(maxValue, arr[i]);
        }

        list.add(minValue);
        list.add(maxValue);

        return list;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        String str=obj.nextLine();
        String strarray[]=str.split(",");

        int arr[]=new int[strarray.length];

        for(int i=0;i<strarray.length;i++){
            arr[i]=Integer.parseInt(strarray[i]);
        }

        // Method 1
        ArrayList<Integer> ans=getMinMax(arr);
        System.out.println(ans);

        // Method 2
        ArrayList<Integer> ans2=getMinMax2(arr);
        System.out.println(ans2);

        obj.close();
    }
}