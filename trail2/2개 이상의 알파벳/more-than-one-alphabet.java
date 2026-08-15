/*  2026-08-15
    Java 학습 : Call by value / Call by reference
    < 2개 이상의 알파벳 >
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        System.out.println(hasOtherChar(A) ? "Yes" : "No");
    }

    public static boolean hasOtherChar(String s) {
        // 2개 이상인지 판단하는 로직
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                return true;
            }
        }

        return false;
    }
}