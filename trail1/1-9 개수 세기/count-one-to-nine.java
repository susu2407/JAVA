import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] countArr = new int[9];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            
            for (int j = 0; j < 9; j++) {
                if (arr[i] == j + 1) {
                    countArr[j]++;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(countArr[i]);
        }
    }
}