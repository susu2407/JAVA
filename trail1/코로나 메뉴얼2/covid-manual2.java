import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] count = new int[4];       // [0]:A, [1]:B, [2]:C, [3]:D

        for (int i = 0; i < 3; i++) {
            char cold = sc.next().charAt(0);    // Y or N

            int temper = sc.nextInt();          // 체온

            if (cold == 'Y') {
                if (temper >= 37) {
                    count[0]++;   
                } else {
                    count[2]++;
                }
            } else if (cold == 'N') {
                if (temper >= 37) {
                    count[1]++;;
                } else {
                    count[3]++;
                }
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