import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] a = new String[n];
        String totStr = "";

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
            totStr += a[i];
        }

        for (int i = 0; i < totStr.length(); i++) {
            System.out.print(totStr.charAt(i));

            if (i % 5 == 4) {
                System.out.println();
            }
        }
    }
}