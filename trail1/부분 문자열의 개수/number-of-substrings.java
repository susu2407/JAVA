import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int lenA = A.length();
        int lenB = B.length();

        int count = 0;

        for (int i = 0; i < lenA - 1; i++) {

            if (A.substring(i, i + 2).equals(B)) {
                count++;
            }   
        }

        System.out.println(count);
    }
}