import java.util.Scanner;

public class readarray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        // Method 1 
        // It allows us to read the variable size array 
        String str=obj.nextLine();
        String strarray[]=str.split(",");

        int arr[]=new int[strarray.length];

        for(int i=0;i<strarray.length;i++){
            arr[i]=Integer.parseInt(strarray[i]);
        }


        // Method 2
        // It allow us to read fixed sized array every time
        int size=obj.nextInt();
        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int num:array){
            System.out.print(num+" ");
        }

        obj.close();
    }
}
