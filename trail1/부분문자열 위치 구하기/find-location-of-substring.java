import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int lenA = a.length();
        int lenB = b.length();

        int startIdx = -1;

        for (int i = 0; i < lenA - lenB + 1; i++) {
            boolean allSame = true;
            
            for (int j = 0; j < lenB; j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    allSame = false;
                    break;
                }
            }

            if (allSame == true) {
                startIdx = i;
                break;
            }
        }

        System.out.println(startIdx);
    }
}