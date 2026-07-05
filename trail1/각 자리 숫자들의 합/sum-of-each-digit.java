import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Integer.toString() 함수 학습
        String s = Integer.toString(n);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            sum = sum + (c - '0');
        }

        System.out.println(sum);
    }
}