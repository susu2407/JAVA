import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수 선언 및 입력:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Please write your code here.
        printSquare(n);
    }

    public static void printSquare(int n) {

        int[][] arr2rd = new int[n][n];

        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (++num % 10 == 0) {
                    num++;
                } else {
                    num = num % 10;
                }

                arr2rd[i][j] = num % 10;

                System.out.print(arr2rd[i][j] + " ");
            }
            System.out.println();
        }


    }
}