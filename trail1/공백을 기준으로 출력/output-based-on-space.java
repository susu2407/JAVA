import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String[] result1 = new String[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                System.out.print(str1.charAt(i));
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                System.out.print(str2.charAt(i));
            }
        }

    }
}