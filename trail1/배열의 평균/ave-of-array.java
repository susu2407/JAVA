import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        // 배열
        int [][] arr2d = new int[2][4];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        // 가로 평균
        for (int i = 0; i < 2; i++) {
            float sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr2d[i][j];
            }
            System.out.printf("%.1f ", sum / 4);
        }

        System.out.println();

        // 세로 평균
        for (int j = 0; j < 4; j++) {
            float sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += arr2d[i][j];
            }
            System.out.printf("%.1f ", sum / 2);
        }
        System.out.println();

        // 전체 평균
        float sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr2d[i][j];
            }
        }
        System.out.printf("%.1f ", sum / 8);
    }
}