import java.util.Arrays;
import java.util.Scanner;

public class kthsmallest{
    public static int kthSmallest(int[] arr, int k) {
        // write Solution
        // Time complexity -> O(n log(n))
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        int k=obj.nextInt();
        obj.nextLine();

        String str=obj.nextLine();
        String strarray[]=str.split(",");

        int arr[]=new int[strarray.length];

        for(int i=0;i<strarray.length;i++){
            arr[i]=Integer.parseInt(strarray[i]);
        }

        int ans=kthSmallest(arr, k);
        System.out.println(ans);

        obj.close();
    }
}