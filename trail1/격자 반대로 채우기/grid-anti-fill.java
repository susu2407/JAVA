import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr2d = new int[N][N];

        int num = 1;
        /*
        규칙 찾기 4*4
        3,3
        2,3
        1,3
        0,3

        0,2
        1,2
        2,2
        ...

        규칙 찾기 5*5
        4,4
        3,4
        2,4
        1,4
        0,4

        0,3
        1,3
        2,3
        3,3
        4,3

        4,2
        ...
        */

        int colCount = 0;

        for (int col = N-1; col >= 0; col--) {

            if (colCount % 2 == 0) {
                for (int row = N - 1; row >= 0; row--) {
                    arr2d[row][col] = num++;
                }
            }
            else {
                for (int row = 0; row < N; row++) {
                    arr2d[row][col] = num++;
                }
            }

            colCount++;
        }

        for (int i = 0; i < N; i++) {
            for (int j =0; j < N; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}