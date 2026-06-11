import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int[] count = new int[1000];

        int maxVal = -1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }

        for (int i = 0; i < N; i++) {
            int currentVal = arr[i];

            if (count[currentVal] == 1 && currentVal > maxVal) {
                maxVal = arr[i];
            }
            
        }
        System.out.println(maxVal);
    }
}