import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            if (a == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
