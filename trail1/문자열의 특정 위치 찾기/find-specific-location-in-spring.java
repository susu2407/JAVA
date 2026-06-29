import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        int len = str.length();

        int startIdx = -1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == c) {
                startIdx = i;
                break;
            }
        }

        if (startIdx != -1) {
            System.out.println(startIdx);
        } else {
            System.out.println("No");
        }
    }
}