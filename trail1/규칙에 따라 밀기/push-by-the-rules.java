import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String LorR = sc.next();

        int lenA = A.length();
        int lenLR = LorR.length();

        char[] arrA = A.toCharArray();
        char[] arrLR = LorR.toCharArray();

        for (int i = 0; i < lenLR; i++) {
            if (arrLR[i] == 'L') {
                A = A.substring(1) + A.substring(0, 1);
            } 
            else if (arrLR[i] == 'R') {
                A = A.substring(lenA - 1) + A.substring(0, lenA - 1);
            }
        }

        System.out.println(A);
    }
}