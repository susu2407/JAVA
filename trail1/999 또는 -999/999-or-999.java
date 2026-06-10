import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            int input = sc.nextInt();
            list.add(input);

            if (input == -999 || input == 999) {
                break;
            }
        }

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() - 1; i++) {
            int num = list.get(i);

            if (num > maxVal) {
                maxVal = num;
            }

            if (num < minVal) {
                minVal = num;
            }
        }
        
        System.out.println(maxVal + " " + minVal);
    }
}