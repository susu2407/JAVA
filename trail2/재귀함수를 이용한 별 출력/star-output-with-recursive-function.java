import java.util.Scanner;

/*  2026-09-07
    Java 학습 : 값을 반환하지 않는 재귀함수
    < 재귀함수를 이용한 별 출력 >
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printStar(n);
    }

    public static void printStar(int n) {
        if (n == 0) return;

        printStar(n - 1);

        // 한 줄에 n개의 *
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}