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
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    count++;
                }
            }
        }

        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}