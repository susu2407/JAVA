import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char current = str.charAt(0); // 현재 문자
        int count = 1;                // 현재 문자의 개수

        String result = "";

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == current) {
                count++;
            } else {
                result += current;
                result += count;

                current = str.charAt(i);
                count = 1;
            }
        }

        // 마지막 문자 추가
        result += current;
        result += count;

        // 출력
        System.out.println(result.length());
        System.out.println(result);
    }
}