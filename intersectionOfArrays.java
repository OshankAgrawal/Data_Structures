import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class intersectionOfArrays {

    // Method 1 but it gives us TLE
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> list1=new ArrayList<>();
        for(int num:a){
            list1.add(num);
        }
        ArrayList<Integer> list2=new ArrayList<>();
        for(int num:b){
            list2.add(num);
        }
        int count=0;
        for(int num:a){
            if(list2.contains(num)){
                count++;
            }
        }
        for(int num:b){
            if(list1.contains(num)){
                count++;
            }
        }
        return count/2;
    }

    // Method 2
    public static int intersectSize2(int a[], int b[]) {
        // Your code here    
        HashSet<Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        
        return (a.length + b.length) - set.size();
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
        System.out.println(intersectSize(arr, arr2));

        System.out.println("Method 2");
        System.out.println(intersectSize2(arr, arr2));

        obj.close();
    }
}
