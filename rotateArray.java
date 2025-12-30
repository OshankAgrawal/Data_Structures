import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {

    public static void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        String str=obj.nextLine();
        String strarray[]=str.split(",");

        int arr[]=new int[strarray.length];

        for(int i=0;i<strarray.length;i++){
            arr[i]=Integer.parseInt(strarray[i]);
        }

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println("Rotate Array");
        System.out.println(Arrays.toString(arr));

        obj.close();
    }
}
