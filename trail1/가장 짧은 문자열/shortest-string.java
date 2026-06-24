import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int maxLen = 0;
        int minLen = 0;

        if (str1.length() > str2.length()) {

            if (str1.length() > str3.length()) {
                maxLen = str1.length();
                
                if (str2.length() > str3.length()) {
                    minLen = str3.length();     // ( 1 , 2, 3 )
                } else {
                    minLen = str2.length();     // ( 1, 3, 2 )
                }

            } else {
                maxLen = str3.length();
                minLen = str2.length();         // ( 3, 1, 2 )              
            } 

        } else {
            if (str2.length() > str3.length()) {
                maxLen = str2.length();

                if (str1.length() > str3.length()) {
                    minLen = str3.length();     // ( 2, 1, 3 )
                } else {
                    minLen = str1.length();     // ( 2, 3, 1 )
                }
            } else {
                maxLen = str3.length();
                minLen = str1.length();         // ( 3, 2, 1 )
            }
        }

        System.out.println(maxLen - minLen);
    }
}
