import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if ( (str.length() - 1 - i) % 2 == 1 ) {
                System.out.print(str.charAt(str.length() - 1 - i));
            }
        }
    }
}