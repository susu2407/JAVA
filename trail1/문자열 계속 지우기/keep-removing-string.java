import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        for (int i = 0; i < A.length() - B.length() + 1; i++) {
            if (A.substring(i, i + B.length()).equals(B)) {
                A = A.substring(0, i) + A.substring(i + B.length());
            }
        }

        System.out.println(A);
    }
}