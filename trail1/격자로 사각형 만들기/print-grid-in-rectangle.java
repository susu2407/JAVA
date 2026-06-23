import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr2d = new int[N][N];

        // 1. 첫 번째 행과 열에는 모두 1일 들어갑니다.
        for (int i = 0; i < N; i++) {
            arr2d[0][i] = 1;
            arr2d[i][0] = 1;
        }

        // 2. 나머지 칸들은 바로 위의 값과 바로 왼쪽 값, 그리고 왼쪽 위의 값의 합이 되어야 합니다.
        /*
        규칙 파악
        ↘ ↓     (i-1,j-1) (i-1,j)
        → 합!    (i  ,j-1) (i,  j)
        */

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                arr2d[i][j] = arr2d[i-1][j-1] + arr2d[i-1][j] + arr2d[i][j-1];
            }
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}