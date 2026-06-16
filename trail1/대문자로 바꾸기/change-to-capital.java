import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[][] arr2d = new char[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {

                // 문자 하나의 소문자를 대문자로 바꾸는 메서드: Character.toUpperCase()
                arr2d[i][j] = Character.toUpperCase(sc.next().charAt(0));

                System.out.print(arr2d[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}