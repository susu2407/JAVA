import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i].charAt(0) == c) {
                count++;

                sum += arr[i].length();
            }
        }

        System.out.printf("%d %.2f", count, (double)sum/count);
    }
}