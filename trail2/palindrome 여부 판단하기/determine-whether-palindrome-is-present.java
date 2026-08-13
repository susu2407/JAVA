/*  2026-08-13
    Java 학습 : 문자열을 인자로 받는 함수
    palindrome 여부 판단하기
        palindrome : 회문. 앞에서부터 읽으나 뒤에서부터 읽으나 똑같은 단어나 문장을 뜻함.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        System.out.println(palindrome(input) ? "Yes" : "No");
    }

    public static boolean palindrome(String s) {
        String reverseString = reverse(s);

        return s.equals(reverseString);
    }

    public static String reverse(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {   // 뒤에서부터(s.length() - 1) 0까지 거꾸로 접근
            reversed += s.charAt(i);                // 글자를 뒤에서부터 붙임
        }

        return reversed;
    }
}