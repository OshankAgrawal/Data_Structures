import java.util.Scanner;

public class reverseArray{

    public static void getreverseArray(int arr[]) {
        // code here
        int len=arr.length-1;
        int i=0;
        while(i<len){
            int temp=arr[i];
            arr[i]=arr[len];
            arr[len]=temp;
            i++;
            len--;
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

        
        getreverseArray(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        obj.close();
    }
}