import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] score = new int[100];
        int[] scoreCount = new int[10];

        for (int i = 0; i < 100; i++) {
            score[i] = sc.nextInt();

            if (score[i] == 0) {
                break;
            }

            switch (score[i] / 10) {
                case 10:
                    scoreCount[9]++;
                    break;
                case 9:
                    scoreCount[8]++;
                    break;
                case 8:
                    scoreCount[7]++;
                    break;
                case 7:
                    scoreCount[6]++;
                    break;
                case 6:
                    scoreCount[5]++;
                    break;
                case 5:
                    scoreCount[4]++;
                    break;
                case 4:
                    scoreCount[3]++;
                    break;
                case 3:
                    scoreCount[2]++;
                    break;
                case 2:
                    scoreCount[1]++;
                    break;
                case 1:
                    scoreCount[0]++;
                    break;
            }
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println( (i + 1) * 10 + " - " + scoreCount[i]);
        }
    }
}