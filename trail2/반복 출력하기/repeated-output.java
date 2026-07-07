import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 변수 선언 및 입력:
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printNLine(N);
    }

    // n개의 줄에 걸쳐 특정 문자열을 출력하는 함수입니다.
    public static void printNLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("12345^&*()_");
        }
    }
}