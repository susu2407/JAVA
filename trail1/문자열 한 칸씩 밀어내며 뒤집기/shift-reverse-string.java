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
                    StringBuilder sb = new StringBuilder(s);    // 불변인 String을 수정가능한 StringBuilder로 수정

                    s = sb.reverse().toString();    // 문자열(s)을 뒤집고(reverse) 다지 String으로 변경

                    System.out.println(s);
                    break;
            }
        }
    }
}