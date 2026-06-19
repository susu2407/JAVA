import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc  = new Scanner(System.in);

        int[][] arr2dA = new int[3][3];
        int[][] arr2dB = new int[3][3];

         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2dA[i][j] = sc.nextInt();
            }
         }
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2dB[i][j] = sc.nextInt();
            }
         }

        int[][] arr2dMul = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2dMul[i][j] = arr2dA[i][j] * arr2dB[i][j];

                System.out.print(arr2dMul[i][j] + " ");
            }
            System.out.println();
        }
    }
}