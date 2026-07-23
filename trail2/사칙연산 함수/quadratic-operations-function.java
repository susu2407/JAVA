import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        // 문제 요구에 맞게, 4개의 함수를 작성하여 진행 ver.
        switch (o) {
            case '+' : 
                System.out.println(a + " " + o + " " + c + " = " + add(a, c));
                break;

            case '-' :
                System.out.println(a + " " + o + " " + c + " = " + sub(a, c));
                break;

            case '*' :
                System.out.println(a + " " + o + " " + c + " = " + mul(a, c));
                break;

            case '/' :
                System.out.println(a + " " + o + " " + c + " = " + div(a, c));
                break;

            default : 
                System.out.println("False");
        }
    }

    public static int add(int a, int c) { return a + c; }

    public static int sub(int a, int c) { return a - c; }

    public static int mul(int a, int c) { return a * c; }

    public static int div(int a, int c) { return a / c; }

}