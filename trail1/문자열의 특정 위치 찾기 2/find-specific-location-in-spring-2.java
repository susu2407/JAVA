import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(2) == c || arr[i].charAt(3) == c) {
                System.out.println(arr[i]);
                count++;
            }
        }
        
        System.out.println(count);;
    }
}