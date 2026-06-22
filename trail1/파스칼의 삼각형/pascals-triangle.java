import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.'
        Scanner sc = new Scanner(System.in);

        // 행의 크기가 정수 N으로 주어집니다.
        int N = sc.nextInt();

        // 파스칼 삼각형 출력
        int[][] arr2d = new int[N][N];

        // 1. 첫번째 열에 전부 숫자 1
        for (int i = 0; i < N; i++ ) {
            arr2d[i][0] = 1;
        }

        // 1-2. 마지막 열에 전부 숫자 1
        // 2. 조건에 맞게 진행: 핵심 조건 j <= i
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                arr2d[i][j] = arr2d[i-1][j-1] + arr2d[i-1][j];
            }
        }
        // 출력
        for (int i= 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}