import java.util.Scanner;

public class arrayLCM {

    static long lcmOfArray(int N, int A[]) {
        // complete the function here
        long result = 1;
        for (int i = 0; i < N; i++) {
            result = lcm(A[i], result) % 1000000007;
        }
        return result;
    }

    static long lcm(long num1, long num2) {
        return (num1 * num2) / hcf(num1, num2);
    }

    static long hcf(long num1, long num2) {
        long divisor = Math.min(num1, num2);
        long dividend = Math.max(num1, num2);
        long rem = dividend % divisor;
        while (rem != 0) {
            dividend = divisor;
            divisor = rem;
            rem = dividend % divisor;
        }
        return divisor;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int size = obj.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println(lcmOfArray(size, arr));

        obj.close();
    }
}
