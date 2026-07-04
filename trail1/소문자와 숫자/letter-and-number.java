import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if ('A' <= a && a <= 'Z') {
                System.out.print((char)(a - 'A' + 'a'));
            } else if ('a' <= a && a <= 'z') {
                System.out.print(a);
            } else if ('0' <= a && a <= '9') {
                System.out.print(a);
            }
        }
    }
}