import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] arr2d = new int[N][M];

        int num = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    arr2d[j][i] = num++;
                } else {
                    arr2d[N-1-j][i] = num++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}