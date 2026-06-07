import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] score = new int[100];
        int[] scoreCount = new int[11];

        for (int i = 0; i < 100; i++) {
            score[i] = sc.nextInt();

            if (score[i] == 0) {
                break;
            }

            scoreCount[score[i] / 10]++;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println( i * 10 + " - " + scoreCount[i]);
        }
    }
}