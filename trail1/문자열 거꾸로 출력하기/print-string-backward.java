import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // 초기화 및 입력 받기
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();

            if (arr[i].equals("END"))
                break;
        }

        // 입력된 문자열을 거꾸로 뒤집기
        for (int i = 0; i < 10; i++) {
            
            if (arr[i].equals("END")) { // END인 경우, 뒤집기 않고 즉시 종료.
                break;
            } else {                    // 뒤집기
                int len = arr[i].length();
                
                for (int j = 0; j < len; j++) {
                    System.out.print(arr[i].charAt(len - 1 - j));
                }

                System.out.println();
            }
            
        }
    }
}