import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < len - 1; i++) {
            if (str.substring(i, i + 2).equals("ee")) {
                count1++;
            } else if (str.substring(i, i + 2).equals("eb")) {
                count2++;
            }
        }

        System.out.println(count1 + " " + count2);
    }
}