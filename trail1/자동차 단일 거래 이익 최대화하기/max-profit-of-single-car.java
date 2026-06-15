import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] price = new int[N];

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        int minPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < N; i++) {
            maxProfit = Math.max(maxProfit, price[i] - minPrice);
            minPrice = Math.min(minPrice, price[i]);
        }

        System.out.println(maxProfit);
    }
}