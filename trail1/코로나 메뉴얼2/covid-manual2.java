import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] result = new char[3];

        int[] count = new int[4];       // [0]:A, [1]:B, [2]:C, [3]:D

        for (int i = 0; i < 3; i++) {
            char cold = sc.next().charAt(0);    // Y or N

            int temper = sc.nextInt();          // 체온

            if (cold == 'Y' && temper >= 37) {
                result[i] = 'A';
                count[0]++;
            } else if (cold == 'N' && temper >= 37) {
                result[i] = 'B';
                count[1]++;
            } else if (cold == 'Y' && temper < 37) {
                result[i] = 'C';
                count[2]++;
            } else if (cold == 'N' && temper < 37) {
                result[i] = 'D';
                count[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(count[i] + " ");
        }

        if (count[0] >= 2) {
            System.out.print('E');
        }
    }
}