import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr2d = new int[N][N];  // 배열을 0으로 초기화

        // 격자 위에 M개의 동전의 위치 저장
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr2d[a-1][b-1] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}