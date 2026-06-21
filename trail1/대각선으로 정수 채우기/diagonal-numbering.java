import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr2d = new int[N][M];

        int num = 1;

        /* 규칙 파악...
        5 X 6 일 때..
        (0,0)  -> 합 0
        (0,1), (1,0)  -> 1
        (0,2), (1,1), (2,0)  -> 2
        (0,3), (1,2), (2,1), (3,0)  2-> 3
        (0,4), (1,3), (2,2), (3,1), (4,0)  -> 4
        (0,5), (1,4). (2,3), (3,2), (4,1)  -> 5
        (1,5), (2,4), (3,3), (4,2)  -> 6
        (2,5), (3,4), (4,3)  -> 7
        (3,5), (4,4)  -> 8
        (4,5)  -> 9

        행 + 열 의 값이 1씩 올라가네?!

        (row, col)
        */

        for (int sum = 0; sum <= (N-1)+(M-1); sum++) {
            for (int row = 0; row < N; row++) {
                int col = sum - row;

                if (col >= 0 && col < M) {
                    arr2d[row][col] = num++;
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