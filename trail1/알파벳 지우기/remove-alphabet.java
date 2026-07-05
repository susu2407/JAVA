import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B= sc.next();

        int numA = convert(A);
        int numB = convert(B);

        System.out.println(numA + numB);
    } 

    public static int convert(String str) {
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                num = num * 10 + (int)(str.charAt(i) - '0');
            }
        }

        return num;
    }
}