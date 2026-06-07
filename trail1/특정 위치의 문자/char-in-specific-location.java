import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        char input = sc.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            if (word[i] == input) {
                System.out.println(i);
                break;
            } else {
                System.out.println("None");
            }
        }
    }
}