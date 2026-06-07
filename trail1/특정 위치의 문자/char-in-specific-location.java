import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        char serch = sc.next().charAt(0)
;
        int exis = -1;

        for (int i = 0; i < 6; i++) {
            if (word[i] == serch) {
                exis = i;
            }
        }

        if (exis == -1) {
            System.out.println("None");
        } else {
            System.out.println(exis);
        }
    }
}