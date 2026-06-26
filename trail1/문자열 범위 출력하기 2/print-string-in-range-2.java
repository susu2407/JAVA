import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        int n = sc.nextInt();

        for (int i = len - 1; i >= len - n; i--) {
            System.out.print(str.charAt(i));
        }
    }
}