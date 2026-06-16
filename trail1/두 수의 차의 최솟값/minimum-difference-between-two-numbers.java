import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            int currentDiff = arr[i] - arr[i-1];

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        System.out.println(minDiff);
    }
}