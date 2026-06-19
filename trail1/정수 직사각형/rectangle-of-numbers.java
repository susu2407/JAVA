import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 행 개수
        int M = sc.nextInt();   // 열 개수

        int [][] arr2d = new int[N][M];

        int num = 0;
    
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr2d[i][j] = ++num;

                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}