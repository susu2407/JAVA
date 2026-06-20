import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr2d = new int[N][N];

        int num = 1;

        // 원소 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr2d[j][i] = num++;
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