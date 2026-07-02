import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int Q = sc.nextInt();

        int len = s.length();

        for (int i = 0; i < Q; i++) {
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    s = s.substring(1, len) + s.substring(0, 1);
                    System.out.println(s);
                    break;
                case 2:
                    s = s.substring(len - 1) + s.substring(0, len - 1);
                    System.out.println(s);
                    break;
                case 3:
                    String reverse = "";
                    for (int j = 0; j < len; j++) {
                        reverse += s.charAt(len - 1 - j);
                    }
                    System.out.println(reverse);
                    break;
            }
        }
    }
}