import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int numA = 0;
        int numB = 0;

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);

            if ('0' <= c && c <= '9') {
                numA = numA * 10 + (c - '0');
            } else {
                // 정수 이외의 문자가 나오면 멈춤
                break;
            }
        }

        for (int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);

            if ('0' <= c && c <= '9') {
                numB = numB * 10 + (c - '0');
            } else {
                // 정수 이외의 문자가 나오면 멈춤
                break;
            }
        }

        System.out.println(numA + numB);
    }
}