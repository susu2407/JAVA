import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        int sum = 0;

        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);

            if ('0' <= a && a <= '9') {
                sum += (int)(a - '0');
            }
        }

        System.out.println(sum);
    }
}