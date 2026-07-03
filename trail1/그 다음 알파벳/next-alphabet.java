import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if (a != 'z') {
            // ver.1
            // int b = (int)a + 1;
            // System.out.println((char)b);

            // ver.2
            char c = (char) (a + 1);
            System.out.println(c);
        } else {
            System.out.println('a');
        }
    }
}