import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];

        // 배열 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrB[i][j] = sc.nextInt();
            }
        }

        // 조건 수행
        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 주어진 두 격자에서 같은 위치에 존재하는 수의 값이 같다면 0
                if (arrA[i][j] == arrB[i][j]) {
                    result[i][j] = 0;
                } 
                // 그렇지 않다면 1을 적어주려 합니다.
                else {
                    result[i][j] = 1;
                }

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}