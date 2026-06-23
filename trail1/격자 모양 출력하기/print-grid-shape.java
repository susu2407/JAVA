import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr2d = new int[N + 1][N + 1];  // 단, 행과 열의 번호는 1부터 시작됩니다.

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt();
            int s = sc.nextInt();

            arr2d[r][s] = r * s;
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }


    }
}