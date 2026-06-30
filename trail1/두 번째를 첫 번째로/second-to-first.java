import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // 주어진 문자열

        char[] arr = str.toCharArray();

        char a = arr[0]; // 첫 번째 문자 - 바꿀 문자
        char b = arr[1]; // 두 번째 문자 - 변경 대상 문자

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                arr[i] = a;
            }
        }

        // 출력
        System.out.println(arr);
    }
}