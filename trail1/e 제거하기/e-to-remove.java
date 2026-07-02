import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while (str.contains("e")) {
            int idx = str.indexOf("e");

            str = str.substring(0, idx) + str.substring(idx + 1);
            break;
        }

        System.out.println(str);
    }
}