import java.util.Scanner;

/*  2026-08-15
    Java 학습 : Call by value / Call by reference
    < 절댓값으로 변경 >
*/
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        absolute(arr);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static int[] absolute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] *= -1;
            }
        }
        return arr;
    }
}