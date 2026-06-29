import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();
        boolean exists1 = false;
        boolean exists2 = false;

        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                exists1 = true;
            } else if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                exists2 = true;
            }
        }

        if (exists1 == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (exists2 == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}