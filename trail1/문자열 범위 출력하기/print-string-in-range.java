import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        for (int i = 2; i < 10; i++) {  // 입력 조건으로 문자열의 길이아 10이상이라고 했으므로. 10보다 작을 경우는 생각하지 않는다.
            System.out.print(str.charAt(i));
        }
    }
}