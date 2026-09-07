import java.util.Scanner;

/*
    2026-09-07
    Java 학습 : 값을 반환하지 않는 재귀함수
    < 수 차례로 출력하기 >
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNumAsc(n);
        System.out.println();
        printNumDesc(n);
    }

    public static void printNumAsc(int n) {
        if (n == 0) return;

        printNumAsc(n - 1);

        System.out.print(n + " ");
    }

    public static void printNumDesc(int n) {
        if (n == 0) return;

        System.out.print(n + " ");

        printNumDesc(n - 1);
    }
}