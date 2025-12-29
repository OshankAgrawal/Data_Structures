import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class sort_0s_1s_and_2s {

    public static void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
    }

    public static void sortArray(int arr[]){
        // Time complexity -> O(n)
        // Space Complexity -> O(n)

        /*
            Instead of using the HashMap we can also use tha array of size 3
        */

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int zeroesCount=map.getOrDefault(0, 0);
        int onceCount=map.getOrDefault(1, 0);

        for(int i=0;i<arr.length;i++){
            if(i<zeroesCount){
                arr[i]=0;
            }else if(i<zeroesCount+onceCount){
                arr[i]=1;
            }else{
                arr[i]=2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        String str=obj.nextLine();
        String strarray[]=str.split(",");

        int arr[]=new int[strarray.length];

        for(int i=0;i<strarray.length;i++){
            arr[i]=Integer.parseInt(strarray[i]);
        }

        // Method 1 but it is not applicable because in the question it is says that you are not allowed to using the in-build function of sorting.
        // sort012(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();

        // Method 2
        sortArray(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

        obj.close();

    }
}
